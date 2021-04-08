package com.scala.test

/**
 * @author zhulongkun20@163.com
 * @since 2021/4/7 10:47 PM
 */
class Person {
    var name = ""

    override def toString: String = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {
    var salary = 0.0

    override def toString: String = super.toString + "[salary=" + salary + "]"
}

object Test extends App {
    val fred = new Employee
    fred.name = "Fred"
    fred.salary = 50000
    println(fred)
}