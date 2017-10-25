package com.example.hzaier.myapplicationkt

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
}