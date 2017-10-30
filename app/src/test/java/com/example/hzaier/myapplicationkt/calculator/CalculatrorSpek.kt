package com.example.hzaier.myapplicationkt.calculator

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by hzaier on 10/30/2017.
 */
//https://stackoverflow.com/questions/44919436/java-lang-classnotfoundexception-com-intellij-junit5-junit5ideatestrunner-using
@RunWith(JUnitPlatform::class)
class CalculatorSpek : Spek({
    //with old way of mocking using the NullObject designPatter
    //val calculator  = Calculator(NullResult())

    var calculator: Calculator? = null
    val result: Result = mock()

    describe("The test of the calculator") {

        beforeEachTest {
            // calculator = Calculator(NullResult())
            calculator = Calculator(result)
        }
        it("should add two numbers") {
            val total = calculator?.add(5, 8)
            Assertions.assertEquals(13, total)
        }

        it("should accumulate  one number") {
            calculator?.accumulate(1)
            Assertions.assertEquals(1, calculator?.total)
        }

        it("should accumulate  two numbers") {
            calculator?.accumulate(5)
            calculator?.accumulate(9)
            Assertions.assertEquals(14, calculator?.total)
        }
        it("should let the output be written correctly --dependency") {
            calculator?.accumulate(9)
            calculator?.accumulate(5)
            verify(result).write(14)
        }
    }
})