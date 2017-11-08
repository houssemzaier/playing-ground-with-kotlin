package com.example.hzaier.myapplicationkt.SAM;

import com.example.hzaier.myapplicationkt.persons.User;

/**
 * Created by houssem on 06/11/2017.
 */

public class MyViewControllerProd {
    User user = new User("XX");

    void showUser(ViewClick viewClick) {
        viewClick.onView(user);
    }

    void showUser(ViewClick2 viewClick) {
        viewClick.onResult();
    }

    void showUser2(ViewClick2 viewClick) {
        viewClick.onResult();
    }

    void showUser31(ViewClick13 viewClick) {
    }

    void showUser311(User user, ViewClick13 viewClick) {
        viewClick.onView(1,"",new User(""));
    }
}
