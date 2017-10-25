package com.example.hzaier.myapplicationkt.utils

/**
 * Created by hzaier on 10/24/2017.
 */
sealed class SeasonType {
    class Spring : SeasonType()
    class Summer : SeasonType()
    class Autumn : SeasonType()
    class Winter : SeasonType()

    fun getTempFromSeason(seasonType: SeasonType) = when (seasonType) {
        is Spring -> println("not very hot")
        is Summer -> println("  very hot")
        is Autumn -> println("not very cold")
        is Winter -> println("  very cold")
    }


}