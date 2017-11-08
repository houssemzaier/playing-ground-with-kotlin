package com.example.hzaier.myapplicationkt.SAM;


import com.example.hzaier.myapplicationkt.persons.User;

import java.util.Date;

public class UserClicker {
    void makeClick(OnClickListener onClickListener) {
        onClickListener.onClick(9999, new Date(), new User("XXAAXXAA"));
    }
}