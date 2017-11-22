package com.example.hzaier.myapplicationkt.utils

import com.example.hzaier.myapplicationkt.papers.Book
import com.example.hzaier.myapplicationkt.persons.User
import java.util.*

/**
 * Created by hzaier on 10/24/2017.
 */
interface JsonRpcSerilizer<T> {
    fun toJsonRpc(item: T)
}

class Utility() {
    companion object : JsonRpcSerilizer<Book> {
        override fun toJsonRpc(item: Book) {
            println(item.toString())
        }

        fun calculateDateNow() = Date()
    }

}

//extensionFunction
fun String.replaceMultipleWhiteSpaceEx(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}


operator fun User.plus(user: User?): User? {
    return User(this.name + "___" + user?.name)
}

infix fun User.add(user: User?): User? {
    return User(this.name + "___" + user?.name)
}

inline fun User.writeLn(user: User?, action: () -> Unit) {
    action()
    User(this.name + "___" + user?.name)
}

inline fun <reified T> useGenericReification(list: Array<Any>) {
    list.forEach {
        if (it is T) {
            println("yes it is  the type")
            return@forEach
        }
    }
}

