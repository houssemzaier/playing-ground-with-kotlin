package com.example.hzaier.myapplicationkt

import java.util.*

/**
 * Created by hzaier on 10/25/2017.
 */
interface IPersonFactory {
    fun createPerson(): Person
}

class PersonFactory private constructor() {
    companion object : IPersonFactory {
        override fun createPerson(): Person {
            return StupidPerson(Date());
        }
    }

    private class StupidPerson(date: Date) : Person(date) {
        override fun makeSomeChildren(numberOfChildren: Int) {
            println("stupid person at $date is having $numberOfChildren")
        }

    }
}
