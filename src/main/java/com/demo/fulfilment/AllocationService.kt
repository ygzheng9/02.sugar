package com.demo.fulfilment

import com.demo.common.model.InvtrAllocDtl
import com.demo.common.model.MvmtDtl
import com.demo.common.model.SoItm
import com.jfinal.aop.Inject
import com.jfinal.kit.Kv
import com.jfinal.plugin.activerecord.Db
import com.jfinal.plugin.activerecord.Record
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

data class AllocInfo(var id: Int, var soItmId: Int, var movementId: Int,
                     var customerCode: String, var materialCode: String, var orderNum: String, var placeDate: java.util.Date,
                     var itemSeq: Int, var allocType: String, var allocQty: BigDecimal,
                     var allocDate: java.util.Date, var allocUser: String
                    )


open class AllocationService {
    @Inject
    lateinit var itemService: SoItemService

    @Inject
    lateinit var mvtService: MovementService

    private val allocDtl = InvtrAllocDtl().dao()

    fun findByMaterial(materailCode: String?): List<InvtrAllocDtl> {
        return allocDtl.template("allocation.findByMaterial", Kv.by("materialCode", materailCode)).find()
    }

    fun findAll(materailCode: String) : List<AllocInfo>  {
        // 建议直接返回 Record，除非有明确需要在做成 typed data class，这里只是示意；
        // return Db.template("allocation.findAll", Kv.by("materialCode", materailCode)).find();

        val items = Db.template("allocation.findAll", Kv.by("materialCode", materailCode)).find();
        val a =  items.map { AllocInfo(
            it.getInt("id"),
            it.getInt("soItemId"),
            it.getInt("movementItemId"),
            it.get("customerCode"),
            it.get("materialCode"),
            it.get("orderNum"),
            it.getDate("placeDate"),
            it.getInt("itemSeq"),
            it.get("allocType"),
            it.getBigDecimal("allocQty"),
            it.getDate("allocDate"),
            it.get("allocUser")
            ) }

        return a
    }

    fun delete(id: Long) : Int {
        return Db.template("allocation.delete", id).delete()
    }

    fun markDelivered(orderNum: String) : Int {
        return Db.template("allocation.markDelivered", orderNum).update()
    }

    fun cancelDelivered(orderNum: String): Int {
        return Db.template("allocation.cancelDelivered", orderNum).update()
    }

    open fun alloc() {
        val itemList = itemService.findAllOpen()
        val movementList = mvtService.findAllOpen()
        doMatch(itemList, movementList)
    }

    open fun doMatch(
        soItemList: List<SoItm>,
        movementList: List<MvmtDtl>
    ) {
        val allcList = ArrayList<InvtrAllocDtl>(soItemList.size)

        for (soItem in soItemList) {
            val materialCode = soItem.materialCode
            // 订单行项目中，如果 已分配数量 等于 总数量，表示已经全量分配，不需要再分配了；
            var itemGap = soItem.orderQty.subtract(soItem.getAllocQty())
            if (itemGap.compareTo(BigDecimal.ZERO) == 0) {
                continue
            }
            // 在入库明细中，找到该物料的入库记录，并且还有未分配的数量
            for (movement in movementList) {
                if (materialCode.compareTo(movement.materialCode) == 0) {
                    // 订单行项目，已经分配足够，不需要再分配，需要对下一个订单行项目进行分配；
                    itemGap = soItem.orderQty.subtract(soItem.allocQty)
                    if (itemGap.compareTo(BigDecimal.ZERO) == 0) {
                        break
                    }

                    // 如果入库明细中，已经完全分配了，表示没有剩余库存可分配了；需要分配下一笔入库明细
                    val movementGap = movement.movementQty.subtract(movement.allocQty)
                    if (movementGap.compareTo(BigDecimal.ZERO) == 0) {
                        continue
                    }

                    movement.markDirty()
                    soItem.markDirty()

                    val alloc = InvtrAllocDtl()
                    alloc.soItemId = soItem.id
                    alloc.movementItemId = movement.id
                    alloc.allocType = "分配"
                    alloc.allocUser = "robot"
                    alloc.allocDate = Date()

                    if (movementGap >= itemGap) {
                        // 如果本条入库明细中的待分配数量足够
                        movement.allocQty = movement.allocQty.add(itemGap)
                        soItem.allocQty = soItem.orderQty

                        alloc.allocQty = itemGap
                        allcList.add(alloc)
                        break
                    } else {
                        // 本条入库明细中的待分配数量，不够订单行项目的缺口
                        movement.allocQty = movement.movementQty
                        soItem.allocQty = soItem.allocQty.add(movementGap)

                        alloc.allocQty = movementGap
                        allcList.add(alloc)
                        continue
                    }
                }
            }
        }
        // 保存到数据库
        for (alloc in allcList) {
            alloc.save()
        }
        for (soItem in soItemList) {
            if (soItem.isDirty) {
                itemService.updateAllocQty(soItem)
            }
        }
        for (movement in movementList) {
            if (movement.isDirty) {
                mvtService.updateAllocQty(movement)
            }
        }
    }

    fun cancelAlloc(id: Int) {
        // 该分配行对应的：
        // 订单行项目 已分配数量 减少
        // 库存入库 已分配数量 减少
        // 删除该分配行

        Db.template("allocation.cancelAllocItm", id).update()
        Db.template("allocation.cancelAllocMM", id).update()
        Db.template("allocation.delete", id).delete()
    }

}
