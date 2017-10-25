package com.example.hzaier.myapplicationkt

import java.util.*

/**
 * Created by houssem on 24/10/2017.
 */
data class Book(var bookId: String,
                var bookName: String,
                var bookAuthorName: String,
                var dateBook: Date
) : Person(dateBook) {
    override fun makeSomeChildren(numberOfChildren: Int) {
        {
            printself()
            println("$numberOfChildren")
        }
    }

    constructor(person: Person) : this("NaN", "NaN", "NaN", Date()) {
        this.person = person
    }

    private var person: Person? = null

    fun printself() {
        println("this are the infos of the book: $bookId $bookName $bookAuthorName")
    }
}