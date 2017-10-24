package com.example.hzaier.myapplicationkt

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainTest {
    @Test
    fun mainTest() {

        println("start programming !")

        val user: User? = User(name = "HOUSSEM")
        user?.age = 30
        val phoneNumber = user?.phoneNumber ?: "+330787878787"
        println("the phone number is $phoneNumber");

        user?.displayWithLambda(::displayInConsole)

        val numberString = "3"
        user?.age = try {
            numberString.toInt()
        } catch (e: Exception) {
            -1
        }

        println("the number is ${user?.age}")
        println("this user has an age of 11 so he is ${user?.getAgeDescription(11)}");
        println("looool     looool".replaceMultipleWhiteSpaceEx())

        var user2 = User("Ronaldo")
        var user3 = user!! + user2
        println("user3: ${user3.name}")

        //user3.printMyValues()

        assertEquals(4, 2 + 2)
    }
}
