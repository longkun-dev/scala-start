package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/7 10:03 PM
 */
class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int): Unit = {
        x = x + dx
        y = y + dy
    }

    override def toString: String = {
        "x: " + x + ", y: " + y
    }
}
