package com.jeang.study.a03_Generics;

import java.util.ArrayList;

public class GenericsTest01 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list.toString());

        ArrayList<String> list1 = new ArrayList<>();
        ListUtils.addAll(list1, "a", "b", "c", "d");
        System.out.println(list1.toString());
    }
}
