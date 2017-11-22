package com.example.hzaier.myapplicationkt.papers

import java.util.*

/**
 * Created by houssem on 25/10/2017.
 */
abstract class PaperCollection(dateBook: Date) {
    abstract fun getPaperCount(): IntRange

}