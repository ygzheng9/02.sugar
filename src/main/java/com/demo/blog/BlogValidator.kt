package com.demo.blog

import com.demo.common.model.Blog
import com.jfinal.core.Controller
import com.jfinal.validate.Validator


class BlogValidator : Validator() {
    override fun validate(controller: Controller) {
        validateRequiredString("blog.title", "titleMsg", "请输入Blog标题!")
        validateRequiredString("blog.content", "contentMsg", "请输入Blog内容!")
    }

    override fun handleError(controller: Controller) {
        controller.keepModel(Blog::class.java)
        val actionKey = actionKey
        if (actionKey == "/blog/save") {
            controller.render("add.html")
        } else if (actionKey == "/blog/update") {
            controller.render("edit.html")
        }
    }
}
