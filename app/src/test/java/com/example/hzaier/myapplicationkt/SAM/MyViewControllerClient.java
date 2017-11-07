package com.example.hzaier.myapplicationkt.SAM;

import com.example.hzaier.myapplicationkt.persons.User;

/**
 * Created by houssem on 06/11/2017.
 */

public class MyViewControllerClient {
    void showUser( MyViewControllerProd myViewController ) {
        myViewController.showUser(new ViewClick() {
            @Override
            public void onView(User user) {
                System.out.println(user.toString());
            }
        });
        myViewController.showUser(new ViewClick2() {
            @Override
            public void onView(User use) {

            }

            @Override
            public void onResult() {

            }
        });
        myViewController.showUser31(new ViewClick13() {
            @Override
            public void onView(int idView, String nameView, User use) {

            }
        });
    }
}