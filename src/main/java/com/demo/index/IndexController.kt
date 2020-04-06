package com.demo.index

import cn.hutool.core.io.FileUtil
import cn.hutool.core.util.StrUtil

import com.demo.common.LayerTable
import com.demo.common.model.Zuser

import com.jfinal.aop.Inject
import com.jfinal.core.Controller
import com.jfinal.kit.JsonKit
import com.jfinal.kit.Kv
import com.jfinal.kit.Ret
import com.jfinal.template.Engine

class IndexController : Controller() {
    @Inject
    lateinit var userSvc: UserService

    fun index() {
        render("index.html")
    }

    fun welcomePage1() {
        render("welcomePage1.html")
    }

    fun welcomePage2() {
        render("welcomePage2.html")
    }

    fun welcomePage3() {
        render("welcomePage3.html")
    }

    fun formDemo() {
        render("form.html");
    }

    fun userList() {
        render("user/list.html")
    }

    fun userFind() {
        // layUI 分页默认是这两个参数名
        val pageNum = getInt("page", 1)
        val pageSize = getInt("limit", 20)

        // layui table 上面的查询条件传入
        val params = get("params", "")

        val users = userSvc.paginate(pageNum, pageSize, params)

        val results = LayerTable.build(users)

        renderJson(results)
    }

    fun userDelete() {
        val id = getInt("id", 0)
        userSvc.deleteById(id)
        renderJson(Ret.ok())
    }

    fun userDeleteBatch() {
        val param = get("param", "")
        val ids = JsonKit.parse(param, Array<String>::class.java)
        userSvc.deleteByBatch(ids)
        renderJson(Ret.ok())
    }

    fun userEntry() {
        var user = Zuser()
        user.id = 0
        user.sex = "未知"

        val id = getInt("id", 0)
        if (id > 0) {
            user = userSvc.findById(id)
        }

        fun <T> getOptions(items : List<T>) : List<Kv> {
            return items.map { Kv().set("value", it).set("label", it) }
        }

        val cities = getOptions(listOf("上海", "北京", "西安", "重庆", "甘肃", "天津", "云南"))
        val departments = getOptions(listOf("营销", "市场", "财务", "人力", "总裁办", "生产", "采购", "仓库"))
        val companies = getOptions(listOf("集团", "能源公司", "科技公司", "工程公司", "财务公司", "供应链公司"));
        val genders = getOptions(listOf("男", "女", "未知"))

        val roleList = ArrayList<String>()
        for (i in 1..30) {
            roleList.add("角色-$i")
        }
        val roles = getOptions(roleList)
        val checkedRoles = StrUtil.split(user.roles, ' ', true, true)
//        println(checkedRoles)

        set("user", user)
        set("cities", cities)
        set("departments", departments)
        set("companies", companies)
        set("genders", genders)
        set("roles", roles)
        set("checkedRoles", checkedRoles)
        render("user/entry.html")
    }

    fun userCreateOrUpdate() {
        val param = get("param", "")
        val user = JsonKit.parse(param, Zuser::class.java)

        // 根据 id 判断是 更新 还是 新增
        val op = if (user.id > 0) user::update else user::save
        if ( op.invoke() ) {
            renderJson(Ret.ok())
        } else {
            renderJson(Ret.fail())
        }
    }
}


fun main() {
    // 把制定目录下的图片，生成成 HTML，共本地浏览使用
    // 1. 本地目录下文件列表；2. 根据后缀名过滤文件；3. 根据文件长度排序；4. 将所有文件名合并成一个列表，送给 html 渲染
    // 统计学习的截屏
    val folderBase = "/Users/ygzheng/Desktop/统计学习方法"
    val outfile = "/Users/ygzheng/Desktop/统计学习方法/index.html"
    val p = "1"
    val path = "$folderBase/$p"

    val allNames = FileUtil.ls(path)
        .map { it.name }
        .filter { it.substringAfterLast(".").compareTo("png", ignoreCase = true) == 0 }
        .groupBy { it.length }
        .toList()
        .sortedBy { it.first }
        .map { it.second.sorted(); }
        .flatten()

    // 根据模板，生成文件
    val param = Kv()
    param["names"] = allNames
    param["base"] = p

    val engine = Engine.use()
    engine.devMode = true
    engine.setToClassPathSourceFactory()

    // 相对于 src/main/recourses
    val template = engine.getTemplate("cmds/stats.html")
//    val html = template.renderToString(param)
//    FileUtil.writeString(html, outfile, CharsetUtil.CHARSET_UTF_8)

    template.render(param, outfile)

    println("write to $outfile.")
}
