package com.example.hzaier.myapplicationkt.utils

/**
 * Created by houssem on 16/11/2017.
 */
object Lambda {
    fun useLambda(func: () -> Boolean) {
        if (func()) {
            return
        }

    }

    inline fun useLambda2(func: () -> Boolean) {
        println("useLambda2")
        val o = func()
        if (o) println("useLambda2 true") else
            println("useLambda2 false")
    }

    inline fun <reified T> dodo(a: T, list: List<Any>) {
        var x = true
        useLambda2 {
            if (a is String) {
                return
            }
            list.size > 3
        }
        list.forEach {
            if (it is T) return
            println("$it ")
        }
        println("done")
        useLambda {
            true
        }

    }

    inline fun f(crossinline body: () -> Unit) {
        val f = object : Runnable {
            override fun run() = body()
        }
        //https://stackoverflow.com/questions/45760817/kotlins-crossinline-keyword
    }

    var h: (_: () -> Unit) -> Unit = {

    }

    inline fun an(noinline body: () -> Unit) {
        h(body)
        body()
    }

}