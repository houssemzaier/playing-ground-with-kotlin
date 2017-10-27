package com.example.hzaier.myapplicationkt.papers

import java.util.*

/**
 * Created by houssem on 25/10/2017.
 */
object Books {
    var allBooks = arrayListOf<Book>()
    fun inisializeBooks() {
        allBooks.add(Book("11111FFE3", "FRFR", "ANDREY", Date()))
        allBooks.add(Book("11111FFE3", "SDER 22222", "VAVA", Date()))
        allBooks.add(Book("11111FFzzE3", "CACA 213", "DEDE", Date()))
        allBooks.add(Book("11111FFEz3", "DROID ZZZ13", "SEDA", Date()))
        allBooks.add(Book("11111FFEz3", "DROID ZZZ13", "SEDA", Date()))
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

}