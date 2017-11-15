package com.example.hzaier.myapplicationkt.utils

/**
 * Created by hzaier on 11/15/2017.
 */
class GenericClassKotlin<R> {
    inline fun <reified T> makeSomething(list: List<Any>) {
        for (o in list) {
            //possible in kotlin
            if (o is T) {

            }

        }
    }
}