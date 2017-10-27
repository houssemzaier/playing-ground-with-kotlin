package com.example.hzaier.myapplicationkt

import com.example.hzaier.myapplicationkt.papers.Book
import com.example.hzaier.myapplicationkt.papers.Books
import com.example.hzaier.myapplicationkt.persons.PersonFactory
import com.example.hzaier.myapplicationkt.persons.User
import com.example.hzaier.myapplicationkt.persons.displayInConsole
import com.example.hzaier.myapplicationkt.utils.*
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

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
        user?.displayWithLambda { it ->
            println("1 it is the user $it")
        }
        user?.displayWithLambda({ it ->
            println("2 it is the user $it")
        })
        user?.displayWithLambda(fun(msg: String) {
            println("3 it is the user $msg")
        })

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
        println("user3: ${user3?.name}")

        //user3.printMyValues()
        SecurityProvider().printProviders()
        SecurityProvider().printProvidersIterator()

        Books.inisializeBooks()
        Books.allBooks.filter { it.bookName == "FRFRa" }.firstOrNull()?.printself()

        println(Utility.calculateDateNow().toString())
        // println("Fibonacci ${Fibonacci.fibunatciSeqFun(-2)}")
        println("Fibonacci ${Fibonacci.fibunatciSeqFun(8)}")

        val stupidPerson = PersonFactory.createPerson(isStupidPerson = true)
        stupidPerson.makeSomeChildren(15)

        var book1 = Book("Mike454654", "AndroidBook", "blablablaAythor", Date())
        book1.bookName = "AAAA"
        book1.printself()

        Books.printTheBook0()
        Books.printTheBook1()
        Books.printTheBook11()
        Books.printTheBook1111()
        Books.printTheBook111()

        assertEquals(4, 2 + 2)
    }
}
