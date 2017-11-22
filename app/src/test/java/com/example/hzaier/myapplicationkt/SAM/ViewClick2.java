package com.example.hzaier.myapplicationkt.SAM;

import com.example.hzaier.myapplicationkt.persons.User;

/**
 * Created by houssem on 05/11/2017.
 */

public interface ViewClick2 {
    void onView(User use);

    void onResult();

    class DefaultViewClick implements ViewClick2 {
        @Override
        public void onView(User use) {
            System.out.println(use.toString());
        }

        @Override
        public void onResult() {

        }
    }
}
