package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/8 10:45 PM
 *        测试类
 */
object Test1 {
    var factor = 3
    val multiplier = (i: Int) => i * factor

    def main(args: Array[String]): Unit = {
        println("multiplier(1) = " + multiplier(1))
        println("multiplier(3) = " + multiplier(3))
    }
}
