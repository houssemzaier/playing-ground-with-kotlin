package com.example.hzaier.myapplicationkt.utils

/**
 * Created by hzaier on 11/15/2017.
 */
class GenericClassKotlinClient {
    val genericClassKotlin = GenericClassKotlin<StringBuilder>()
    
    fun makeSomething() {
        genericClassKotlin.makeSomething<Int>(listOf())
    }
}