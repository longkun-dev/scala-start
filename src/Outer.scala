package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/6 10:22 PM
 */
class Outer {

    class Inner {
        private def f(): Unit = {
            println("f")
        }

        class InnerMost {
            f()
        }

    }
    // 错误
//
}
