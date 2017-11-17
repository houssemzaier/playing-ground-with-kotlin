package com.example.hzaier.myapplicationkt.utils.generic

/**
 * Created by hzaier on 11/15/2017.
 */
class GenericClassKotlin<R> {
    inline fun <reified T> makeSomething(list: List<Any>) {
        for (o in list) {
            //possible in kotlin
            if (o is T) {

            }

        }
    }

    fun make() {
        var list = mutableListOf<Student>()
        list.add(Student())
        list.add(SmartStudent())


        var list1 = mutableListOf<SmartStudent>()
        //list1.add(Student())
        list1.add(SmartStudent())

    }
}

open class Student(val age: Int = 20) {
    open fun makeHomework() {
        println("make homework today")
    }
}

class SmartStudent : Student(13) {
    override fun makeHomework() {
        super.makeHomework()
        println("successfully make homework")
    }
}