package com.example.hzaier.myapplicationkt.lambda

import org.junit.Test


class TestClosure {
    @Test
    fun test() {
        val closure1 = closure()
        val closure2 = closure()

        closure1()
        closure1()
        closure1()

        closure2()
        closure2()
        var some = 0
        val makeClosure = makeClosure()

        for (i in 1.rangeTo(15)) {
            some += makeClosure()
        }
        println("some $some ")

    }
}


var closure = fun(): () -> Unit {
    var i = 0
    return {
        println(++i)
    }
}


fun makeClosure(): () -> Int {
    var i = 0
    return {
        i++
    }
}