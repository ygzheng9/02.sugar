package com.demo.fulfilment

import com.demo.common.model.SoItm
import com.jfinal.kit.Kv
import com.jfinal.plugin.activerecord.Db
import com.sun.mail.iap.ByteArray
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVRecord
import java.io.*
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*

interface IUpload {
    fun upload(reader: Reader)
}

open class SoItemService : IUpload {
    private val soItm = SoItm().dao()

    fun findAll(order: String) : List<SoItm> {
        val kv = Kv().set("orderNum", order)

        return soItm.template("soitem.findAll", kv).find()
    }

    fun findAllOpen() : List<SoItm> {
        return soItm.template("soitem.findAllOpen").find()
    }

    fun updateAllocQty(itm: SoItm) : Int {
        val kv = Kv.by("allocQty", itm.allocQty)
            .set("itemID", itm.id)

        return Db.template("soitem.updateAllocQty", kv).update()
    }

    fun saveNew(itm: SoItm): Boolean {
        return itm.save()
    }

    fun markDelivered(order: String)  : Int {
        return Db.template("soitem.markDelivered", Kv.by("orderNum", order)).update()
    }

    fun cancelDelivered(order: String) : Int {
        return Db.template("soitem.cancelDelivered", Kv.by("orderNum", order)).update()
    }

    fun findByOrderNum(order: String) : List<SoItm> {
        return soItm.template("soitem.findByOrderNum", Kv.by("orderNum", order)).find()
    }

    fun findAllDelivered(order: String) : List<SoItm> {
        return soItm.template("soitem.findAllDelivered", Kv.by("orderNum", order)).find()
    }

    override fun upload(reader: Reader) {
        val sdf = SimpleDateFormat("yyyy/M/d H:m")

        val records: Iterable<CSVRecord> = CSVFormat.DEFAULT.parse(reader)
        val itemList: MutableList<SoItm> = ArrayList<SoItm>(100)

        var idx = 0
        for (record in records) {
            idx += 1

            // 第一行是表头
            if (idx == 1) {
                continue
            }

            // 单号为空，表示已经没有记录了；
            val orderNum: String = record.get(0)
            if (orderNum.trim { it <= ' ' }.isEmpty()) {
                break
            }

            val item = SoItm()
            item.orderNum = orderNum
            item.itemSeq = record.get(1).toLong()

            item.placeDate = sdf.parse(record.get(2))
            item.customerCode = record.get(3)
            item.materialCode = record.get(4)

            item.orderQty = BigDecimal(record.get(5))
            item.remark = record.get(6)
            item.deliveryCustomer = record.get(7)
            item.deliveryAddr = record.get(8)
            item.deliveryPhone = record.get(9)

            itemList.add(item)
        }

        itemList.forEach { it.save() }
    }
 }
