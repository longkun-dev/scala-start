package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/8 11:06 PM
 */
object ArrayTest {
    def main(args: Array[String]): Unit = {
        var arr: Array[String] = new Array[String](2)
        arr(0) = "www.baidu.com"
        arr(1) = "www.sohu.com"
        for (x <- arr) {
            println(x)
        }

        var intArr: Array[Int] = Array(1, 3, 5, 7)
        var sum: Int = 0
        for (i <- intArr.indices) {
            sum += intArr(i)
        }
        println("sum is " + sum)
    }
}
