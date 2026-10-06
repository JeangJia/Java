package com.jeang.study.a02_HashMapTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
//        能保证存和取的顺序一致
        Map<String, Integer> lhs = new LinkedHashMap<>();
        lhs.put("one", 1);
        lhs.put("three", 3);
        lhs.put("two", 2);
        System.out.println(lhs);
    }
}
