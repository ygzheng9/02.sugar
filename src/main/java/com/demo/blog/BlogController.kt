package com.demo.blog

import com.demo.common.model.Blog
import com.jfinal.aop.Before
import com.jfinal.aop.Inject
import com.jfinal.core.Controller


@Before(BlogInterceptor::class)
class BlogController : Controller() {
    @Inject
    lateinit var service: BlogService

    fun index() {
        setAttr("blogPage", service.paginate(getParaToInt(0, 1), 10))
        render("blog.html")
    }

    fun add() {}
    /**
     * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
     * 并要对数据进正确性进行验证，在此仅为了偷懒
     */
    @Before(BlogValidator::class)
    fun save() {
        getBean(Blog::class.java).save()
        redirect("/blog")
    }

    fun edit() {
        setAttr("blog", service.findById(paraToInt))
    }

    /**
     * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
     * 并要对数据进正确性进行验证，在此仅为了偷懒
     */
    @Before(BlogValidator::class)
    fun update() {
        getBean(Blog::class.java).update()
        redirect("/blog")
    }

    fun delete() {
        service.deleteById(paraToInt)
        redirect("/blog")
    }
}
