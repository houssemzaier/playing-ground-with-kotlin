package com.example.hzaier.myapplicationkt.papers

import java.util.*

/**
 * Created by houssem on 25/10/2017.
 */
object Books {
    var allBooks = arrayListOf<Book>()
    val allBooks11111 = listOf<Book>(
            Book("11111ONE_ID", "11111ONE_NAME", "11111ONE_AUTHOR_NAME", Date()),
            Book("11111TWO_ID", "11111TWO_NAME", "11111TWO_AUTHOR_NAME", Date())
    )

    fun inisializeBooks() {
        allBooks.add(Book("11111FFE3", "FRFR", "ANDREY", Date()))
        allBooks.add(Book("11111FFE3a", "SDER 22222", "VAVA", Date()))
        allBooks.add(Book("11111FFzzEa3", "CACA 213", "DEDE", Date()))
        allBooks.add(Book("11111FFEz3", "BAMBOO", "SEDA", Date()))
        allBooks.add(Book("11111FFEz3z", "DROID ZZZ13", "SEDA", Date()))
        allBooks.add(Book("11111FFEzzzz3", "DROID ZZZ13", "SEDA", Date()))
        allBooks.add(Book("11111FFEz3", "DROID ZZZ13", "SEDA", Date()))
    }


    fun printTheBook0() {
        println("printTheBook0")
        allBooks.map {
            println(it)
        }
    }

    fun printTheBook1() {
        println("printTheBook1")
        allBooks.map(::println)
    }

    fun printTheBook11() {
        println("printTheBook11")
        allBooks.forEach(::println)
    }

    fun printTheBook111() {
        println("printTheBook111")
        allBooks.forEach { book -> println(book) }
    }

    fun printTheBook1111() {
        println("printTheBook1111")
        allBooks.forEach {
            it.bookName = ""
            println(it)
        }
    }

    fun findAndSelect() {
        println("printTheBook1111")
        allBooks.filter { it.bookName == "BAMBOO" }.map { findedBook ->
            findedBook.bookAuthorName = "The Master of Bamboo"
            println(findedBook)
        }
    }

    fun predecates() {
        val condition = { it: Book -> it.datePaperCollection.before(Date()) }
        val any: Boolean = allBooks.any(condition)
        val all: Boolean = allBooks.all(condition)
        val found: Book? = allBooks.find(condition)
        val counts: Int = allBooks.count(condition)
    }

    fun flatmapSample() {
        var allBooks1 = listOf<Book>(
                Book("ONE_ID", "ONE_NAME", "ONE_AUTHOR_NAME", Date()),
                Book("TWO_ID", "TWO_NAME", "TWO_AUTHOR_NAME", Date()),
                Book("THREE_ID", "THREE_NAME", "THREE_AUTHOR_NAME", Date())
        )

        //  var X:List<Book> =allBooks1.flatMap(PaperCollection ::all  )
        var xList: List<Book> = allBooks1.flatMap { allBooks11111 }.flatMap { allBooks1 }
        println("xList")
        xList.forEach(::println)
    }

    fun sequence() {
        val map = allBooks11111
                // .asSequence()
                .filter { it -> println("eteration** $it"); it.bookName.length > 2 }.map { it.bookAuthorName + ": " + it.bookName }

        map.forEach {
            println("forEach $it")
        }
    }

}