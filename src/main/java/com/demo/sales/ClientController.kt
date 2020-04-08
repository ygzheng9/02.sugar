package com.demo.sales

import com.demo.common.LayerTable
import com.demo.common.model.ZClientCall
import com.demo.common.model.ZClientPotential
import com.demo.common.model.Zclient
import com.jfinal.aop.Inject
import com.jfinal.core.Controller
import com.jfinal.kit.JsonKit
import com.jfinal.kit.Ret


/*
2020-04-06 zhengyg
 */

class ClientController : Controller() {
    @Inject
    lateinit var clientSvc: ClientService

    fun list() {
        render("client_list.html")
    }

    fun entry() {
        var entry = Zclient()
        entry.id = 0

        val id = getInt("id", 0)
        if (id > 0) {
            entry = clientSvc.findById(id)
        }

        set("entry", entry)
        render("client_entry.html")
    }


    fun newClient() {
        val entry = Zclient()
        entry.id = 0;

        set("entry", entry);
        render("newClient.html")
    }

    fun find() {
        // layUI 分页默认是这两个参数名
        val pageNum = getInt("page", 1)
        val pageSize = getInt("limit", 20)

        // layui table 上面的查询条件传入
        val params = get("params", "")

        val items = clientSvc.paginate(pageNum, pageSize, params)

        val results = LayerTable.build(items)

        renderJson(results)
    }

    fun deleteBy() {
        val id = getInt("id", 0)
        clientSvc.deleteById(id)
        renderJson(Ret.ok())
    }

    fun deleteBatch() {
        val param = get("param", "")
        val ids = JsonKit.parse(param, Array<String>::class.java)
        clientSvc.deleteByBatch(ids)
        renderJson(Ret.ok())
    }

    fun createOrUpdate() {
        val param = get("param", "")
        val entry = JsonKit.parse(param, Zclient::class.java)

        // 根据 id 判断是 更新 还是 新增
        val op = if (entry.id > 0) entry::update else entry::save
        if ( op.invoke() ) {
            renderJson(Ret.ok())
        } else {
            renderJson(Ret.fail())
        }
    }

    fun basicInfo() {
        val clientid = getInt("clientid", 0)

        if (clientid == 0) {
            this.list()
        } else {
            val client = clientSvc.findById(clientid)
            set("client", client);
            render("basic_info.html");
        }
    }

    fun callEntry() {
        var entry = ZClientCall()
        entry.id = 0

        val id = getInt("id", 0)
        if (id > 0) {
            entry = clientSvc.callFindById(id)
        } else {
            entry.clientId = getInt("clientid", 0);
        }

        set("entry", entry)
        render("call_entry.html")
    }

    fun callFind() {
        val clientid = getInt("clientid", 0)

        // layUI 分页默认是这两个参数名
        val pageNum = getInt("page", 1)
        val pageSize = getInt("limit", 20)


        val items = clientSvc.callPaginate(pageNum, pageSize, clientid)

        val results = LayerTable.build(items)

        renderJson(results)
    }

    fun callDeleteBy() {
        val id = getInt("id", 0)
        clientSvc.callDeleteById(id)
        renderJson(Ret.ok())
    }

    fun callDeleteBatch() {
        val param = get("param", "")
        val ids = JsonKit.parse(param, Array<String>::class.java)
        clientSvc.callDeleteByBatch(ids)
        renderJson(Ret.ok())
    }

    fun callCreateOrUpdate() {
        val param = get("param", "")
        val entry = JsonKit.parse(param, ZClientCall::class.java)

        // 根据 id 判断是 更新 还是 新增
        val op = if (entry.id > 0) entry::update else entry::save
        if ( op.invoke() ) {
            renderJson(Ret.ok())
        } else {
            renderJson(Ret.fail())
        }
    }

    fun potentialEntry() {
        var entry = ZClientPotential()

        val clientid = getInt("clientid", 0)
        if (clientid > 0) {
            entry = clientSvc.potentialFindByClient(clientid)
        }

        set("entry", entry)
        render("potential_entry.html")
    }

    fun potentialShow() {
        var entry = ZClientPotential()

        val clientid = getInt("clientid", 0)
        if (clientid > 0) {
            entry = clientSvc.potentialFindByClient(clientid)
        }

        set("entry", entry)
        render("potential_show.html")
    }


    fun potentialCreateOrUpdate() {
        val param = get("param", "")
        val entry = JsonKit.parse(param, ZClientPotential::class.java)

        // 根据 id 判断是 更新 还是 新增
        val op = if (entry.id > 0) entry::update else entry::save
        if ( op.invoke() ) {
            renderJson(Ret.ok())
        } else {
            renderJson(Ret.fail())
        }
    }
}
