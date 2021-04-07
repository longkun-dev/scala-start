package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/6 10:28 PM
 */
object Operator {
    def main(args: Array[String]): Unit = {
        println("1 + 2 is " + addInt(1, 2))
        var testList = List(1, 2, 3)
        var testSet = Set(1, 2, 3)
        var testMap = Map("a" -> 1, "b" -> 2)
        println("list 0 is :" + testList.head)
        println("testSet 0 is :" + testSet.head)
        println("testMap 0 is :" + testMap.head._1)

        var iterator = Iterator("baidu", "Sohu", "Yahoo", "Google")
        while (iterator.hasNext) {
            println(iterator.next())
        }
    }

    def addInt(a: Int, b: Int): Int = {
        var sum: Int = 0
        sum = a + b
        sum
    }

    def subtract(a: Int, b: Int): Int = {
        a - b
    }
}
