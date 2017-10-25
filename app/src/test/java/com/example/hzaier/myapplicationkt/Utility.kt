package com.example.hzaier.myapplicationkt

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

operator infix fun User.plus(user: User?): User? {
    return User(this.name + "___" + user?.name)
}


