package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/8 10:49 PM
 */
object StringTest {
    def main(args: Array[String]): Unit = {
        println("测试开始..")
        val str1 = "test str1"
        val str2 = "test str2"
        println("length of str1 is " + getStringLength(str1))
        println("length of str2 is " + getStringLength(str2))
        println("str1 concat str2 is " + strConcat(str1, str2))
    }

    def getStringLength(str: String): Int = {
        if (str == null || "".equals(str)) {
            return 0
        }
        str.length
    }

    def strConcat(str1: String, str2: String): String = {
        if (str1 == null || "".equals(str1)) {
            return str2
        }
        if (str2 == null || "".equals(str2)) {
            return str1
        }
        str1 + str2
    }
}
