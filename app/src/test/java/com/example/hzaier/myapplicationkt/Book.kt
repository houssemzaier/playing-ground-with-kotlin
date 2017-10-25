package com.example.hzaier.myapplicationkt

/**
 * Created by houssem on 24/10/2017.
 */
data class Book(var bookId: String,
                var bookName: String,
                var bookAuthorName: String
) {
    constructor(person: Person) : this("NaN", "NaN", "NaN") {
        this.person = person
    }

    private var person: Person? = null

    fun printself() {
        println("this are the infos of the book: $bookId $bookName $bookAuthorName")
    }
}