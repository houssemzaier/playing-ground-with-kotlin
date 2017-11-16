package com.example.hzaier.myapplicationkt.utils.generic;

import java.util.ArrayList;

public class GenericClassJavaClient {
    StringBuilder sb = new StringBuilder();
    GenericClassJava sbb = new GenericClassJava<StringBuilder>();

    public void makeSomething() {
        sbb.makeSomething(new ArrayList<Object>());
    }
}