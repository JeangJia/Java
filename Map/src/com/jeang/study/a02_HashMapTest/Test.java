package com.jeang.study.a02_HashMapTest;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Student, String> hs = new HashMap<>();
//        重写equals和hashCode方法
        hs.put(new Student("Jean", 18), "wuhan");
        hs.put(new Student("Jean", 18), "beijing");
        hs.put(new Student("Jeang", 18), "gongdong");
        hs.put(new Student("jeang", 18), "shanghai");

        hs.forEach((k, v) -> {
            System.out.println(k.getName() + " " + k.getAge() + " " + v);
        });
    }
}
