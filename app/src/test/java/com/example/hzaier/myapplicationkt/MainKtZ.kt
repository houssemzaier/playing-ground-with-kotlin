package com.example.hzaier.myapplicationkt

import com.example.hzaier.myapplicationkt.utils.Lambda
import org.junit.Test
import java.util.logging.XMLFormatter

/**
 * Created by hzaier on 10/25/2017.
 */
class MainKtZ {
    @Test
    fun mainTest() {
        Lambda.dodo(::MainKtZ,listOf(33,33,"zzz","zzzzzzz")  )
        Lambda.dodo("",listOf(33,33,"zzz","zzzzzzz")  )
        Lambda.dodo(::XMLFormatter,listOf(33,33,"zzz","zzzzzzz")  )
        Lambda.dodo(::XMLFormatter,listOf( 2,2)  )
    }
}