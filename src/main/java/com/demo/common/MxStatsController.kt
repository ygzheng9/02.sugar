package com.demo.common

import com.jfinal.aop.Inject
import com.jfinal.core.Controller
import com.jfinal.kit.Ret

class MxStatsController : Controller() {
    @Inject
    lateinit var mxSvc : MxStatsService;

    fun findAll() {
        val items = mxSvc.findAll()

        renderJson(Ret.ok("items", items))
    }

    fun findByBL() {
        val bl = get("b")
        val items = mxSvc.findByBL(bl)

        renderJson(Ret.ok("items", items))
    }

    fun findByCust() {
        val cust = get("p")
        val items = mxSvc.findByCust(cust)

        renderJson(Ret.ok("items", items))
    }

    fun segments() {
        val items = mxSvc.getAllSegments()

        renderJson(Ret.ok("items", items))
    }

    fun segmentsReArrage() {
        val items = mxSvc.reArrange()

        renderJson(Ret.ok("items", items))
    }

    fun custBySeg() {
        val seg = getInt("p", 1)
        val items = mxSvc.getCustBySegment(seg)

        renderJson(Ret.ok("items", items))
    }

    fun dailySales() {
        val items = mxSvc.getDailySales()
        renderJson(Ret.ok("items", items))
    }
}
