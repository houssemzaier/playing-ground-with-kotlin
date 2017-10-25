package com.example.hzaier.myapplicationkt.persons

import com.example.hzaier.myapplicationkt.papers.Book
import java.util.*

//only primary constructor can have var val
abstract class Person(val date: Date) : ISleepable, IWalkable {
    var books: Array<Book>? = null
    init {
        books= arrayOf<Book>(Book("DEFAULT IDBOOK","DEFAULT NAMEBOOK","DEFAULT  AUTHOR NAME",Date()))

    }
    abstract fun makeSomeChildren(numberOfChildren: Int)
    open fun makeOneChild() {
        println("I have one child :) ")
    }

    override fun sleep(where: String) {
        super<ISleepable>.sleep("ROME")
        super<IWalkable>.sleep("ROME")
    }

    init {
        println("This person is Default created at $date")
    }
}

interface ISleepable {
    fun sleep(sleepDuration: Long, where: String = "home") {
        println("I have sleeped $sleepDuration seconds in $where")
    }

    fun sleep(where: String) = sleep(1)
}

interface IWalkable {
    fun sleep(where: String) {
        println("I have sleeped when I am walking in $where")
    }
}

class DefaultPerson : Person(date = Date()) {
    override fun makeSomeChildren(numberOfChildren: Int) {
        println("DefaultPerson have many  children :) ")
    }


}




