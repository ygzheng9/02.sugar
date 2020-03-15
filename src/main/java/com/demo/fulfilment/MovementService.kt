package com.demo.fulfilment

import com.demo.common.model.MvmtDtl
import com.jfinal.kit.Kv
import com.jfinal.plugin.activerecord.Db
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVRecord
import java.io.IOException
import java.io.Reader
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*

data class InventoryLevel(var materialCode: String, var totalQty: BigDecimal, var allcQty: BigDecimal, var avlQty: BigDecimal)

open class MovementService : IUpload {
    private val mvDtl = MvmtDtl().dao()

    fun findAll(material : String) : List<MvmtDtl> {
        return mvDtl.template("movement.findAll", Kv.by("materialCode", material)).find()
    }

    fun findAllOpen() : List<MvmtDtl> {
        return mvDtl.template("movement.findAllOpen").find()
    }

    fun updateAllocQty(dtl : MvmtDtl) : Int {
        return Db.template("movement.updateAllocQty", Kv.by("allocatedQty", dtl.allocQty).set("detailID", dtl.id)).update()
    }

    fun saveNew(dtl: MvmtDtl): Boolean {
        return dtl.save()
    }

    fun cancelDelivered(orderNum: String) : Int{
        return Db.template("movement.cancelDelivered", Kv.by("orderNum", orderNum)).update()
    }

    fun getCurrentInvLevel(materialCode: String) : List<InventoryLevel> {
        return Db.template("movement.getCurrentInvLevel", Kv.by("materialCode", materialCode)).find()
            .map { InventoryLevel(
                it.get("materialCode"),
                it.get("totalQty"),
                it.get("allcQty"),
                it.get("avlQty")
            ) }
    }

    override fun upload(reader: Reader) {
        val sdf = SimpleDateFormat("yyyy/M/d H:m")

        val records: Iterable<CSVRecord> = CSVFormat.DEFAULT.parse(reader)
        val itemList: MutableList<MvmtDtl> = ArrayList<MvmtDtl>(20)

        var idx = 0
        for (record in records) {
            idx += 1
            // 第一行是表头
            if (idx == 1) {
                continue
            }
            // 单号为空，表示已经没有记录了；
            val orderNum = record[0]
            if (orderNum.trim { it <= ' ' }.isEmpty()) {
                break
            }

            val item = MvmtDtl()
            item.orderNum = orderNum
            item.itemSeq = record.get(1).toLong()

            item.movementDate = sdf.parse(record.get(2))
            item.movementType = record.get(3)
            item.materialCode = record.get(4)

            item.movementQty = BigDecimal(record[5])
            item.operateUser = record.get(6)

            val dtString = record[7]
            if (dtString.trim { it <= ' ' }.isEmpty()) {
                item.operateDate = Date()

            } else {
                item.operateDate = sdf.parse(dtString)
            }
            itemList.add(item)
        }

        itemList.forEach { it.save() }
    }
}
