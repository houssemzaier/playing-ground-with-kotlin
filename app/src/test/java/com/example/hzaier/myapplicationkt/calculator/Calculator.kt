package com.example.hzaier.myapplicationkt.calculator

/**
 * Created by hzaier on 10/30/2017.
 */
class Calculator(val output: Result) {
    fun add(x: Int, y: Int): Int {
        return x + y
    }
}

interface Result {
    fun write(answer: Int)
}

class NullResult : Result {
    override fun write(answer: Int) {
    }

}
