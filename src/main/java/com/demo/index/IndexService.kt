package com.demo.index

import com.demo.blog.BlogService
import com.jfinal.aop.Inject


open class IndexService {
    @Inject
    private lateinit var service: BlogService

    fun check() {
        val b = service.findById(1)
        println(b)
    }
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

    println(sum(1, 6))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
