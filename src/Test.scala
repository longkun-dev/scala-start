package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/7 9:44 PM
 */
class Test {

    /**
     * 简单的加法
     *
     * @param x 加数
     * @return 这个数加3
     */
    def m(x: Int): Int = x + 3

    /**
     * 一个自然数加3
     */
    val f = (x: Int) => x + 3

    def main(): Unit = {
        val result = m(10)
        println("result: %s", result)
    }
}
