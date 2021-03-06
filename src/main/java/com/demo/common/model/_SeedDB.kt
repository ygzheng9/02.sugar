package com.demo.common.model

import cn.hutool.core.util.StrUtil
import com.demo.common.DemoConfig.Companion.createDruidPlugin
import com.jfinal.plugin.activerecord.ActiveRecordPlugin
import com.jfinal.plugin.activerecord.Db
import kotlin.random.Random


fun main() {
    // 初始化数据库连接
    val druidPlugin = createDruidPlugin()
    druidPlugin.start()
    val arp = ActiveRecordPlugin(druidPlugin)

    // 所有映射在 MappingKit 中自动化搞定
    _MappingKit.mapping(arp)

    // 与 jfinal web 环境唯一的不同是要手动调用一次相关插件的start()方法
    druidPlugin.start();
    arp.start();

    println("executing.....")

    // 通过上面简单的几行代码，即可立即开始使用
    seedZuser()

//    seedZclient()

    println("done.")

}


// 从 list 中随机返回一个值
fun <T> getRandom(list: List<T>): T {
    val i = Random.nextInt(0, list.size)
    return list[i]
}

// 编码前面补零
fun padPre(i: Int, l: Int) : String {
    return StrUtil.padPre("$i", l, "0")
}

fun seedZuser() {
    // 模拟数据的总条数
    val total = 300

    // 模拟数据的可选项
    val departments = listOf("营销", "市场", "财务", "人力", "总裁办", "生产", "采购", "仓库")
    val emails = listOf("@163.com", "@gmail.net", "@cn.ibm.com", "@qq.com")
    val sex = listOf("男", "女")
    val cities = listOf("上海", "北京", "西安", "重庆", "甘肃", "天津", "云南")
    val companies = listOf("集团", "能源公司", "科技公司", "工程公司", "财务公司", "供应链公司")

    // 删除整张表
    Db.delete("truncate table t_zuser")

    // 插入模拟数据
    for(i in  1..total) {
        Zuser().set("userName", "用户-$i")
            .set("email", "$i${getRandom(emails)}")
            .set("company", getRandom(companies))
            .set("department", getRandom(departments))
            .set("city", getRandom(cities))
            .set("sex", getRandom(sex))
            .save();
    }
}


fun seedZclient() {
    // 模拟数据的总条数
    val total = 300

    // 模拟数据的可选项
    val departments = listOf("营销", "市场", "财务", "人力", "总裁办", "生产", "采购", "仓库")
    val industries = listOf("电力", "制造", "外贸", "房地产", "政府")
    val channelTypes = listOf("内销", "外销")
    val priorities = listOf("低", "中", "高")
    val addresses = listOf("杭州", "宁波", "绍兴", "台州")

    // 删除整张表
    Db.delete("truncate table t_zclient")

    // 插入模拟数据
    for(i in  1..total) {
        Zclient().set("clientName", "客户-${padPre(i, 3)}")
            .set("clientCode", "CC-${padPre(i, 3)}")
            .set("industry", "$i${getRandom(industries)}")
            .set("channelType", getRandom(channelTypes))
            .set("priority", getRandom(priorities))
            .set("address", getRandom(addresses))
            .save();
    }
}


