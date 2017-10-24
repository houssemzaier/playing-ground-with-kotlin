@file:JvmName("_User")

package com.example.hzaier.myapplicationkt

import java.util.*

fun displayInConsole(text: String) {
    println("displayedInConsole $text");
}

class User(var name: String) {

    /**
     * ranges
     */
    val alphaCapValues = "A".."Z"
    val tenValuesString = "1".."10"
    val tenValuesInt = 1..10

    val alphaList = listOf("A", "B", "C")
    var alphaTreeMap = TreeMap<String, Int>()

    var age: Int? = null
    var phoneNumber: String? = null


    init {
        alphaTreeMap.put("A", 10)
        alphaTreeMap["B"] = 11
        alphaTreeMap["C"] = 12
        alphaTreeMap["D"] = 13
        alphaTreeMap["E"] = 14
        alphaTreeMap["F"] = 15
        alphaTreeMap["G"] = -1
    }

    fun printMyValues() {
        for (i in alphaTreeMap) {
            println("alphaList")
            println(i);
        }

        for ((index, element) in alphaList.withIndex()) {
            println("alphaList with index")
            println("index $index and value $element");
        }


        for ((letter, hexaValue) in alphaTreeMap) {
            println("alphaList with keys")
            println("key $letter and value $hexaValue");
        }


        for (i in alphaList) {
            println("alphaList")
            println(i);
        }
        for (i in tenValuesInt step 2) {
            println("tenValuesInt step !")
            println(i);
        }
        for (i in tenValuesInt.last downTo tenValuesInt.first step 2) {
            println("tenValuesInt downTo !")
            println(i);
        }
        for (i in tenValuesInt.first until tenValuesInt.last step 1) {
            println("tenValuesInt until !")
            println(i);
        }

    }

    fun displayWithLambda(func: (s: String) -> Unit) {
        func(age.toString())
    }

    fun isOld(): Boolean = age!! > 50

    //function expression
    @JvmOverloads
    fun getAgeDescription(age: Int, nom: String = "The User"): String = when (age) {
        10 -> "**$nom is young**"
        else -> "**$nom is not young**"
    }

}
