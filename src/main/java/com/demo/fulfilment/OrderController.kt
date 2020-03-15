package com.demo.fulfilment

import cn.hutool.core.io.file.FileReader
import com.jfinal.aop.Inject
import com.jfinal.core.Controller
import com.jfinal.core.NotAction
import com.jfinal.json.FastJson
import com.jfinal.kit.Ret
import java.io.IOException


// 订单 - 配货 - 发货
// 出入库明细：补货入库，发货出库
// 现有库存状态查询：总在库量，已配货占用量，剩余可配货量
// 逆向操作；


class OrderController : Controller() {
    @Inject
    lateinit var allocService: AllocationService

    @Inject
    lateinit var itemService: SoItemService

    @Inject
    lateinit var mvtService: MovementService

    @Inject
    lateinit var dlvService: DeliveryService

    // 全部明细
    fun allMovements() {
        val material = get("p", "")
        val items = mvtService.findAll(material)

        renderJson(Ret.ok("items", items))
    }

    fun allSoItems() {
        val orderNum = get("p", "")
        val items = itemService.findAll(orderNum)

        renderJson(Ret.ok("items", items))
    }

    fun allDelivered() {
        val orderNum = get("p", "")
        val items = itemService.findAllDelivered(orderNum)

        renderJson(Ret.ok("items", items))
    }

    fun inventoryLevel() {
        val material = get("p", "")
        val items = mvtService.getCurrentInvLevel(material);

        renderJson(Ret.ok("items", items))
    }

    fun allAlloc() {
        val material = get("p", "")
        val items = allocService.findAll(material);

        items.forEach { println(it) }

        renderJson(Ret.ok("items", items))
    }

    fun allocByMat() {
        val material = get("p", "")
        val items = allocService.findByMaterial(material);

        renderJson(Ret.ok("items", items))
    }

    fun doAlloc() {
        allocService.alloc()

        renderJson(Ret.ok())
    }

    fun cancelAlloc() {
        // 解析 ids
        val json = rawData
        val allocIDs = FastJson.getJson().parse(json, Array<Int>::class.java)

        allocIDs.forEach { allocService.cancelAlloc(it) }
        renderJson(Ret.ok())
    }

    fun doDeliver() {
        // 解析 orders
        val json = rawData
        val orders = FastJson.getJson().parse(json, Array<String>::class.java)

        orders.forEach { dlvService.doDeliver(it) }
        renderJson(Ret.ok())
    }

    fun cancelDelivery() {
        // 解析 orders
        val json = rawData
        val orders = FastJson.getJson().parse(json, Array<String>::class.java)

        orders.forEach { dlvService.cancelDelivery(it) }
        renderJson(Ret.ok())
    }

    fun uploadSoItem() {
        doUpload("uploadSoItem")
    }

    fun uploadMMItem() {
        doUpload("uploadMMItem")
    }

    @NotAction
    fun doUpload(key: String) {
        val tables = mapOf(
            Pair("uploadSoItem",itemService),
            Pair("uploadMMItem", mvtService))

        val svc = tables[key]

        val f = file.file

        if (f == null) {
            renderJson(Ret.fail("msg", "请先选择上传文件"))
            return
        }

        try {
            svc!!.upload(FileReader(f).reader)
            renderJson(Ret.ok())
            return
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
