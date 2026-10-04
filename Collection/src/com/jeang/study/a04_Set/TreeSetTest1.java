package com.jeang.study.a04_Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
//        Set<String> s = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i = o1.length() - o2.length();
//                return i == 0 ? o1.compareTo(o2) : i;
//            }
//        });

//      lambda
        Set<String> s=new TreeSet<>((o1,o2)->{
            int i = o1.length() - o2.length();
            return i == 0 ? o1.compareTo(o2) : i;
        });
        s.add("abd");
        s.add("abc");
        s.add("e");
        s.add("aaaa");
        s.forEach(v -> System.out.println(v));
    }
}
