package com.example.hzaier.myapplicationkt.SAM;

import com.example.hzaier.myapplicationkt.persons.User;

/**
 * Created by houssem on 05/11/2017.
 */

public interface ViewClick {
    void onView(User use);

    class DefaultViewClick implements ViewClick {
        @Override
        public void onView(User use) {
            System.out.println(use.toString());
        }
    }
}
