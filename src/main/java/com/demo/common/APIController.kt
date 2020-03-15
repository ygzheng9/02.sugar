package com.demo.common

import com.jfinal.core.Controller
import com.jfinal.kit.Ret

class APIController : Controller() {
    fun login()  {
        renderJson(Ret.ok("msg", "hello from kotlin").set("status", "ok"))
    }
}
