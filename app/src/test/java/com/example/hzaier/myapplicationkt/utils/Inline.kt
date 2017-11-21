package com.example.hzaier.myapplicationkt.utils

fun threadx(f: () -> Unit) {
    println("f: $f")
}


inline fun testA(noinline f: () -> Unit) {
    threadx { f() }
}

fun testB(f: () -> Unit) {
    threadx { f() }
}

inline fun testC(crossinline f: () -> Unit) {
    threadx { f() }
}

inline fun testIn(s: String, f: (_:Int) -> Unit) {
    f(3)
}

fun testClient() {
    testIn("") {
        println("aaaaaaaaaaa")
    }
}

inline fun <reified T> testD(mList: List<Any>, crossinline f: () -> Unit) {
    mList.forEach {
        if (it is T)
            threadx { f() }
    }
}

inline fun <reified T> testE(mList: List<Any>, noinline f: () -> Unit) {
    mList.forEach {
        if (it is T)
            threadx { f() }
    }
}

inline fun bind(event: String, handler: () -> Unit) {
    testIn("", { _: Int -> handler() })
}

