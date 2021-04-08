package com.scala.test

import java.io.{File, PrintWriter}
import scala.io.{Source, StdIn}

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/8 11:25 PM
 */
object FileTest {
    def main(args: Array[String]): Unit = {
        var writer = new PrintWriter(new File("test.txt"))
        writer.write("hello world!\n")
        writer.write("你好，世界！")
        writer.close()

//        var line = StdIn.readLine()
//        println("你输入的内容是: " + line)

        val inputFile = Source.fromFile("test.txt")
        var lines = inputFile.getLines
        for (line <- lines) {
            println("line: " + line)
        }
    }
}
