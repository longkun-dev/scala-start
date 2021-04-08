package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/7 10:03 PM
 */
class Point(xc: Int, yc: Int) extends Equal {
    var x: Int = xc
    var y: Int = yc

    /**
     * 判断是否相等
     *
     * @param x 参数
     * @return 相等: true  不相等: false
     */
    override def isEqual(x: Any): Boolean = {
        x.isInstanceOf[Point] && x.asInstanceOf[Point].x == x
    }

    override def toString: String = {
        "x: " + x + ", y: " + y
    }
}
