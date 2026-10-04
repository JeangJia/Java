package com.jeang.study.a04_Set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
//      set 里面的方法基本继承自 collection
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }

        set.forEach(s -> System.out.println(s));
    }
}
