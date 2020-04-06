package com.demo.index

import com.demo.common.model.Zuser
import com.jfinal.kit.JsonKit
import com.jfinal.kit.Kv
import com.jfinal.kit.StrKit
import com.jfinal.plugin.activerecord.Db
import com.jfinal.plugin.activerecord.Page

open class UserService {
    private val userDao = Zuser().dao()

    fun paginate(pageNumber: Int, pageSize: Int, params: String): Page<Zuser> {
        var conditions = Kv()
        if (params.isNotEmpty()) {
            conditions = JsonKit.parse(params, Kv::class.java)
        }

        return userDao.template("conditions.findUser", conditions).paginate(pageNumber, pageSize)
  }

    fun findById(id: Int): Zuser {
        return userDao.findById(id)
    }

    fun deleteById(id: Int): Boolean {
        return userDao.deleteById(id)
    }

    fun deleteByBatch(ids: Array<String>): Int {
        val str: String = StrKit.join(ids, ",")
        return Db.update("delete from t_zuser where id in($str)");
    }
}
