package com.jeang.study.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    // 随机N次不同顺序
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1, "apple", "banana", "cherry", "date", "elderberry");
        final int N = 10;
        final int size = list1.size();
        for (int i = 0; i < N; i++) {
            System.out.println("-----第" + (i + 1) + "次------");
            for (int j = 0; j < size; j++) {
                Collections.shuffle(list1);
                list2.add(list1.get(0));
                String t = list1.remove(0);
                System.out.println(t);
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}
