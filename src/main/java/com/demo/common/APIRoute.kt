package com.demo.common

import com.jfinal.config.Routes

import com.demo.fulfilment.OrderController

class APIRoute : Routes() {
    override fun config() {
        setBaseViewPath("/view")

        add("/api", APIController::class.java)

        add("/api/mxstats", MxStatsController::class.java)

        add("/api/fulfil", OrderController::class.java)

    }
}
