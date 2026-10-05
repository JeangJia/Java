package com.jeang.study.a02_HashTest;


import java.util.HashMap;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        String[] list = {"A", "B", "C", "D"};
        HashMap<String, Integer> map = new HashMap<>();
        final int N = 10000;
        Random r = new Random();
        String c = "";
        int count = 1;
        for (int i = 0; i < N; i++) {
            String t = list[r.nextInt(list.length)];
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
                if (map.get(t) > count) {
                    c = t;
                    count = map.get(t);
                }
            } else {
                map.put(t, 1);
            }
        }
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
        System.out.println("max: " + c + " " + count);
    }
}
