package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/8 11:39 PM
 */
object RegexTest {
    def main(args: Array[String]): Unit = {
        var pattern = "(S|s)cala".r
        var str = "scala is nice language"
        var result = pattern findFirstIn str
        println("result is " + result)
    }
}
