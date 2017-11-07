package com.example.hzaier.myapplicationkt.SAM;

import com.example.hzaier.myapplicationkt.persons.User;

/**
 * Created by houssem on 07/11/2017.
 */

public interface ViewClick13 {
    void onView(int idView, String nameView, User use);

    class ViewClick13DefaultImpl implements ViewClick13 {
        @Override
        public void onView(int idView, String nameView, User user) {

        }
    }
}
