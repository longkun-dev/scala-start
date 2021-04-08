package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/8 11:34 PM
 */
object ExceptionTest {
    def main(args: Array[String]): Unit = {
        var arr: Array[Int] = Array(1, 3, 5)
        var result: Int = 0
        try {
            result = arr(100)
        } catch {
            case _: ArrayIndexOutOfBoundsException =>
                println("array index out of bounds exception")
            case _: Exception =>
                println("exception")
        } finally {
            println("计算发生异常")
        }
    }
}
