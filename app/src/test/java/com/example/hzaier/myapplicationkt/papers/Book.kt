package com.example.hzaier.myapplicationkt.papers

import com.example.hzaier.myapplicationkt.persons.Person
import java.util.*

/**
 * Created by houssem on 24/10/2017.
 */
data class Book(var bookId: String,
                var bookName: String,
                var bookAuthorName: String,
                var datePaperCollection: Date
) : PaperCollection(datePaperCollection) {
    private var person: Person? = null




    override fun getPaperCount(): IntRange {
        return 20..1000
    }

    constructor (author: Person) : this(author.books?.first()?.bookId!!, author.books?.first()?.bookName!!, author.books?.first()?.bookAuthorName!!, author.date) {
        this.person = author
    }

    fun printself() {
        println("this are the infos of the book: $bookId $bookName $bookAuthorName")
    }
}