package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/8 11:17 PM
 */
trait Equal {

    /**
     * 判断是否相等
     *
     * @param x 参数
     * @return 相等: true  不相等: false
     */
    def isEqual(x: Any): Boolean

    /**
     * 判断是否不相等
     *
     * @param x 参数
     * @return 相等: false  不相等: true
     */
    def isNotEqual(x: Any): Boolean = !isEqual(x)
}
