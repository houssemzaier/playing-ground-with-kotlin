package com.example.hzaier.myapplicationkt.utils

/**
 * Created by houssem on 16/11/2017.
 */
class Lambda {
    fun useLambda(func: () -> Boolean) {
        if (func()) {
            return
        }

    }

    fun dodo() {
        useLambda {
            true
        }

    }
}