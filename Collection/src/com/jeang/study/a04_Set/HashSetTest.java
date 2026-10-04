package com.jeang.study.a04_Set;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);

        hs.add(s1);
        hs.add(s2);
        System.out.println(s1.equals(s2)); // true
//      获取哈希值，用于判断两个对象是否相等
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(hs.toString());
    }
}
