package com.example.hzaier.myapplicationkt.lambda

import org.junit.Test

/**
 * Created by hzaier on 11/23/2017.
 */
/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */
class TestClosureReturn {
    @Test()
    fun test() {
        println("Hello, world!")
        Maker().doTheHardWork()
        println("Hello, world!")

    }
}

class Maker {
    var n = 0

    fun doTheHardWork(stop: Boolean = false) {
        println('z')
        make@
        makeSomething(true) {
            for (i in 1..20) {
                println("i $i")
                if (!stop)
                    n++
                if (n == 5) return@make

            }
        }

    }

    inline fun makeSomething(isOk: Boolean, foo: () -> Unit) {
        println("isOk $isOk")
        foo()
        if (isOk) {
        }

    }
}