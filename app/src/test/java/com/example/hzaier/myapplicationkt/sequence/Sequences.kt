package com.example.hzaier.myapplicationkt.sequence

import org.junit.Test

/**
 * Created by houssem on 27/11/2017.
 */
class Test {

    @Test
    fun sequences() {
        val list = listOf<Int>(10, 15, 33, 45, 98, -99, 77)
        val sequence: Sequence<Int> = list.asSequence()
        sequence.drop(2).take(2)
        println("sequence: ${sequence.toList()}")


        var list2 = generateSequence(100) { it * 2 }.take(20).toList()
        println("sequence: $list2 and the size is ${list2.size}")

        var list22 = generateSequence(1) { it * 2 }.take(20).toList()
        println("sequence: $list22 and the size is ${list22.size}")


        var list3 = generateSequence(1 to 5) { it.second to it.second + it.first }
                .take(20).toList()
        println("sequence: $list3 and the size is ${list3.size}")


        var list4 = generateSequence(1 to 5) { it.first * 2 to it.second + it.first }
                .take(20).toList()
        println("sequence: $list4 and the size is ${list4.size}")


    }

}