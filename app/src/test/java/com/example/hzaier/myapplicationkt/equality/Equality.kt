package com.example.hzaier.myapplicationkt.equality

import org.junit.Test

class Test {
    @Test
    fun test() {
        println("Hello, world!")
        var user1 = User("NOVA", "TOTI")
        var user2 = User("NOVA", "TOTI")

        var equality1 = user1 === user2
        var equality2 = user1 == user2

        println("equality1   $equality1")
        println("equality2   $equality2")
    }
}

data class User(val fName: String, val lName: String)