package com.example.hzaier.myapplicationkt.SAM

import com.example.hzaier.myapplicationkt.persons.User
import java.util.*

/**
 * Created by houssem on 08/11/2017.
 */
class UserClickerKt {
    fun makeClick(onClickListener: OnClickListener) {
        var user: User = User("X")
        onClickListener.onClick(user.age ?: 0, Date(), user)
    }

    fun makeClick(userClicker: UserClicker) {

        userClicker.makeClick(OnClickListener(fun(age: Int, date: Date, user: User) {
            println("age $age")
            println("date $date")
            println("user $user")

        }))

        userClicker.makeClick { age: Int, date: Date, user: User ->
            println("age $age")
            println("date $date")
            println("user $user")
        }

//        userClicker.makeClick (::printer)
    }

    fun printer(age: Int, date: Date, user: User) {
        println("age $age")
        println("date $date")
        println("user $user")

    }

}