package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/7 9:49 PM
 */
object FuncTest {
    def addInt(x: Int, y: Int): Int = {
        x + y
    }

    def notify(name: String, count: Int): String = {
        name + "你好，你的账户余额为：" + (count - 1) + "个币"
    }

    def main(args: Array[String]): Unit = {
        val result = addInt(10, 20)
        printf("result is %s", result)
        println()

        val result1 = notify("张静", 12)
        println(result1)

        var point = new Point(1, 3)
        point.move(2, 5)
        println(point)
    }
}
