package com.jeang.study.a03_TreeMap;

import java.util.Random;
import java.util.TreeMap;

public class TreeMapTest1 {
    public static void main(String[] args) {
        Random r = new Random();
        final int N = 10000;
        String s = "abcd";
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String c = s.charAt(r.nextInt(s.length())) + "";
            if (tm.containsKey(c)) {
                tm.put(c, tm.get(c) + 1);
            } else {
                tm.put(c, 1);
            }
        }
        tm.forEach((k, v) -> System.out.print(k + "(" + v + ")"));
    }
}
