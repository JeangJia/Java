package com.jeang.study.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "apple", "banana", "cherry", "date", "elderberry");
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
