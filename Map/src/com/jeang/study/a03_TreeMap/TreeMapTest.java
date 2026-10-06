package com.jeang.study.a03_TreeMap;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> hm = new TreeMap<>((o1, o2) ->
                o2 - o1
        );
        hm.put(3, "three");
        hm.put(1, "one");
        hm.put(2, "two");
        System.out.println(hm);
    }
}
