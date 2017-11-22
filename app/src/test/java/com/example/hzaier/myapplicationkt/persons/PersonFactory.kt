package com.example.hzaier.myapplicationkt.persons

import java.util.*

/**
 * Created by hzaier on 10/25/2017.
 */
interface IPersonFactory {
    fun createPerson(isStupidPerson: Boolean): Person
}

//strategy && factory DesignPattern
class PersonFactory private constructor() {
    companion object : IPersonFactory {
        override fun createPerson(isStupidPerson: Boolean): Person {

            if (isStupidPerson) {
                return StupidPerson(Date())
            }

            //anonymous function
            return object : Person(Date()) {
                override fun makeSomeChildren(numberOfChildren: Int) {
                    println("default Person make $numberOfChildren Children")
                }

            }

        }
    }

    private class StupidPerson(date: Date) : Person(date) {
        override fun makeSomeChildren(numberOfChildren: Int) {
            println("stupid person at $date is having $numberOfChildren")
        }

    }
}
