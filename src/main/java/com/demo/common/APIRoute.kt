package com.demo.common

import com.demo.fulfilment.OrderController
import com.jfinal.config.Routes

class APIRoute : Routes() {
    override fun config() {
        setBaseViewPath("/view")

        add("/api", APIController::class.java)

        add("/api/mxstats", MxStatsController::class.java)

        add("/api/fulfil", OrderController::class.java)

    }
}
