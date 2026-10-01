package com.jeang.study;

import java.util.StringJoiner;

public class stringjoiner {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","<",">");
        sj.add("Java").add("C++").add("Python");
        System.out.println(sj.toString());
    }
}
