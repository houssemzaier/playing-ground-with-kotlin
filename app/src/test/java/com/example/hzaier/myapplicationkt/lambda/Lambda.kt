package com.example.hzaier.myapplicationkt.lambda

import org.junit.Test

/**
 * Created by hzaier on 11/20/2017.
 */
class Lambda {

    fun myFunction(aFun: () -> Unit) {
        aFun()

    }

    //an anonymous function returning function of type lambda
    var x = fun() = {
        ->
        println("X!")
    }
    var xx = {
        ->
        println("XX!")
    }


}

class Test {
    @Test
    fun test() {
        with(Lambda()) {
            myFunction(fun() {
                println("a run 1")
            })
            myFunction(fun() {
                println("a run 1")
            })
            myFunction({
                println("a run 2")
            })

            myFunction {
                println("a run 3")
            }
            myFunction { ->
                println("a run 4")
            }
        }

        Lambda().x()()
        Lambda().xx()

    }
}
