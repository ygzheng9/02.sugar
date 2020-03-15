package com.demo.common

import com.demo.common.model.Mxstats
import com.jfinal.plugin.activerecord.Db
import java.util.*


data class Segment(var seg: Int, var count: Int)
data class DailySales(var bizDate: Date, var vol1: Int, var vol2: Int)

open class MxStatsService {
    private val mxStats = Mxstats().dao()

    fun findAll() : List<Mxstats> {
        return mxStats.template("mxstats.findAll").find();
    }

    fun findByBL(bl:String) : List<Mxstats> {
        return mxStats.template("mxstats.findByBL", bl).find();
    }

    fun findByCust(cust: String) : List<Mxstats> {
        return mxStats.template("mxstats.findByCust", cust).find();
    }

    fun getAllSegments() : List<Segment> {
        // group by Bl count per Cust
        return findAll().asSequence()
            .groupBy { it.custNme }
            .map { it.key to it.value.size }
            .groupBy { it.second }
            .map { it.key to it.value.size }
            .toList()
            .map { Segment(it.first, it.second) }
            .toList()
            .sortedBy { it.seg }
    }

    // 按照提单数量，形成分组，1,2,3, 4~5,6~10,11+
    fun reArrange(): List<Segment> {
        val arr: MutableMap<Int, Int> = HashMap()

        return getAllSegments().fold(arr) { acc, seg ->
            val key = seg.seg
            val cnt = seg.count
            val currTotal = key * cnt

            val newKey = when (key) {
                in 1..3 -> key
                in 4..5 -> 4
                in 6..10 -> 6
                else -> 11
            }

            if (acc[newKey] != null) acc[newKey]!!.plus(currTotal) else {
                acc[newKey] = currTotal
            }

            acc
        }
            .toList()
            .map { Segment(it.first, it.second) }
    }

    fun getCustBySegment(s:Int) : List<String> {
        return findAll().asSequence().groupBy { it.custNme }
            .map { it.key to it.value.size }
            .toList()
            .filter { it.second == s }
            .map { it.first }.toList()

    }

    fun getDailySales() : List<DailySales> {
        return Db.template("mxstats.getDailySales").find()
            .map {
                DailySales(it.getDate("biz_date"),
                    it.getInt("bl_cnt"),
                    it.getInt("cust_cnt"))
            }
    }
}
