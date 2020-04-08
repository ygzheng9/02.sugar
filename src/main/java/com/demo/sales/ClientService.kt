package com.demo.sales

import com.demo.common.model.ZClientCall
import com.demo.common.model.ZClientPotential
import com.demo.common.model.Zclient
import com.demo.common.model.Zuser
import com.jfinal.kit.JsonKit
import com.jfinal.kit.Kv
import com.jfinal.kit.StrKit
import com.jfinal.plugin.activerecord.Db
import com.jfinal.plugin.activerecord.Page

open class ClientService {
    private val clientDao = Zclient().dao()

    private val callDao = ZClientCall().dao()

    private val potentialDao = ZClientPotential().dao()


    fun paginate(pageNumber: Int, pageSize: Int, params: String): Page<Zclient> {
        var conditions = Kv()
        if (params.isNotEmpty()) {
            conditions = JsonKit.parse(params, Kv::class.java)
        }

        return clientDao.template("conditions.findClient", conditions).paginate(pageNumber, pageSize)
    }

    fun findById(id: Int): Zclient {
        return clientDao.findById(id)
    }

    fun deleteById(id: Int): Boolean {
        return clientDao.deleteById(id)
    }

    fun deleteByBatch(ids: Array<String>): Int {
        val str: String = StrKit.join(ids, ",")
        return Db.update("delete from t_zuser where id in($str)");
    }

    fun callPaginate(pageNumber: Int, pageSize: Int, clientid: Int): Page<ZClientCall> {
        return callDao.template("conditions.findCall", clientid).paginate(pageNumber, pageSize)
    }

    fun callFindById(id: Int): ZClientCall {
        return callDao.findById(id)
    }

    fun callDeleteById(id: Int): Boolean {
        return callDao.deleteById(id)
    }

    fun callDeleteByBatch(ids: Array<String>): Int {
        val str: String = StrKit.join(ids, ",")
        return Db.update("delete from t_z_client_call where id in($str)");
    }

    fun potentialFindByClient(clientid: Int) : ZClientPotential {
        val items = potentialDao.template("conditions.findPotentialByClient", clientid).find()

        if (items.size > 0) {
            return items[0]
        }

        val a =  ZClientPotential()
        a.id = 0
        a.clientid = clientid

        return a
    }
}
