package com.example.hzaier.myapplicationkt.forops

import org.junit.Test

/**
 * Created by houssem on 19/11/2017.
 */

object Ops {
    fun forComplex() {
        for ((index, item) in 10.rangeTo(250).step(2).withIndex()) {
            println("index $index item $item ")
        }
    }

    fun forTabl() {
        var tab: Array<Int> = arrayOf(5, 5, 555, 778, 9, 3)
        for ((index, item) in tab.withIndex()) {
            println("index $index item $item ")
        }
        for ((index) in tab.withIndex()) {
            println("index $index item ")
        }
        for (item in tab.indices) {
            println("item $item ")
        }
        for (item in tab ) {
            println("item $item ")
        }
    }
}

class MainTest {
    @Test
    fun mainTest() {
        Ops.forTabl()
    }
}