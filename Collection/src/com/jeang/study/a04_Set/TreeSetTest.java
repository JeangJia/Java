package com.jeang.study.a04_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(4);
//       默认升序
        System.out.println(s);
        s.forEach(i-> System.out.print(i+" "));

        Set<Student> s1=new TreeSet<>();
        s1.add(new Student("zhangsan", 18));
        s1.add(new Student("lisi", 19));
        s1.add(new Student("wangwu", 20));

        System.out.println(s1);
    }
}
