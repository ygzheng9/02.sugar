package com.demo.blog

import com.jfinal.aop.Interceptor
import com.jfinal.aop.Invocation


class BlogInterceptor : Interceptor {
    override fun intercept(inv: Invocation) {
        println("Before invoking " + inv.actionKey)
        inv.invoke()
        println("After invoking " + inv.actionKey)
    }
}
