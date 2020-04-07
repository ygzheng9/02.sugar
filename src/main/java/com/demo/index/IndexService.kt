package com.demo.index

import cn.hutool.core.io.FileUtil
import com.demo.blog.BlogService
import com.demo.common.model.Blog
import com.demo.common.model.Zuser
import com.jfinal.aop.Inject
import com.jfinal.kit.Kv
import com.jfinal.plugin.activerecord.Page
import com.jfinal.template.Engine


open class IndexService {

}

fun main() {
    println("Hello World")

    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    println(s1)

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

    val arr = listOf(1, 2, 3)
    arr.forEach { it + 2 }

    arr.forEach { println(it) }
}

fun dumpHtml() {
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
