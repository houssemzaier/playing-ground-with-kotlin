package com.example.hzaier.myapplicationkt.`this`

import org.junit.Test

class A { // implicit label @A
    val funLit = lambda@ fun String.() {
        val d = this // funLit's receiver a String
        println("" + d.plus("BBBBB").plus("ZZ").toString())
    }
    val lambda = lambda1@ fun(): Int {
        return -1
    }
    val lambda2 = fun(): Int {
        return -11
    }

    inner class B { // implicit label @B
        val x = 33
        fun Int.foo() { // implicit label @foo
            val a = this@A // A's this
            val b = this@B // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver a String
            }


            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }

}

class Test {
    @Test
    fun test() {
        println(" ${A().B().x}")
        println(" ${A().lambda()}")
        println(" ${A().lambda2()}")
        A().funLit
    }
}