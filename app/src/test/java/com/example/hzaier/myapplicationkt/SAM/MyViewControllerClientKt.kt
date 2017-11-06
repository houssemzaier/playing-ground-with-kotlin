package com.example.hzaier.myapplicationkt.SAM

import com.example.hzaier.myapplicationkt.persons.User

/**
 * Created by houssem on 06/11/2017.
 */
class MyViewControllerKtClient {
    fun showUser(myViewController: MyViewControllerProd) {
        myViewController.showUser {
            println("$it")
        }
        //construct a java interface which have a single method
        var event = ViewClick(
                { println("$it") }
        )

        myViewController.showUser { x: User -> println("$x") }

        myViewController.showUser2(object : ViewClick2 {
            override fun onView(use: User?) {
            }
            override fun onResult() {
            }
        })


    }
}