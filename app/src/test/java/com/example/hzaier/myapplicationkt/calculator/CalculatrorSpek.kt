package com.example.hzaier.myapplicationkt.calculator

import junit.framework.Assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by hzaier on 10/30/2017.
 */
//https://stackoverflow.com/questions/44919436/java-lang-classnotfoundexception-com-intellij-junit5-junit5ideatestrunner-using
@RunWith(JUnitPlatform::class)
class CalculatorSpek : Spek({
    //with old way of mocking using the NullObject designPatter
    val calculator = Calculator(NullResult())
    describe("The calculator") {
        it("should add two numbers") {
            val result = calculator.add(5, 8)
            Assert.assertEquals(13, result)
        }
    }
})