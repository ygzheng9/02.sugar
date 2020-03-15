package com.demo.fulfilment

import com.demo.common.model.MvmtDtl
import com.jfinal.aop.Inject
import java.util.*

open class DeliveryService {
    @Inject
    lateinit var itemService: SoItemService

    @Inject
    lateinit var allocService: AllocationService

    @Inject
    lateinit var mvtService: MovementService

    fun doDeliver(orderNum: String) {
        // 订单行项目 发货数量 等于 已分配数量
        // 分配表中，标记 已出库=Y
        // 进出库明细中，插入出库数据； --> 数量等于订单行上的已出库数量，方向是出库；
        itemService.markDelivered(orderNum)
        allocService.markDelivered(orderNum)

        val itemList = itemService.findByOrderNum(orderNum)
        for (item in itemList) {
            val now = Date()

            val dtl = MvmtDtl()
            dtl.movementType = "销售出库"
            dtl.orderNum = item.orderNum
            dtl.itemSeq = item.itemSeq
            dtl.materialCode = item.materialCode
            dtl.movementQty = item.deliveryQty
            dtl.movementDate = now
            dtl.allocQty = dtl.movementQty
            dtl.operateDate = now
            dtl.operateUser = "robot"

            mvtService.saveNew(dtl)
        }
    }

    fun cancelDelivery(orderNum: String) {
        // 订单行项目 设置 发货数量=0，标记=N
        // 库存分配表中，设置 已出库=N
        // 进出库明细中，删除该订单对应的出库数据；
        itemService.cancelDelivered(orderNum)
        allocService.cancelDelivered(orderNum)
        mvtService.cancelDelivered(orderNum)
    }
}
