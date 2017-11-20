package com.example.hzaier.myapplicationkt.components

import org.junit.Test

/**
 * Created by houssem on 20/11/2017.
 */
class Day(
        val orderDay: String,
        val hourDay: String,
        val isWorkingDay: Boolean) {
    operator fun component1(): String = orderDay
    operator fun component2(): String = hourDay
    operator fun component3(): Boolean = isWorkingDay
}

data class DayData(
        val orderDay: String,
        val hourDay: String,
        val isWorkingDay: Boolean)

class TestLocal {
    @Test
    fun test() {
        val (v1, v2, v3) = Day("0", "15:47", true);
        val (v11, v22, v33) = DayData("0", "15:47", true);
        println("v1 $v1 v2 $v2 v3 $v3 v11 $v11 v22 $v22 v33 $v33")
    }

}