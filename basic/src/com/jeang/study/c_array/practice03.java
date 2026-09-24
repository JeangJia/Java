package com.jeang.study.c_array;

import java.util.Random;

public class practice03 {
    public static void main(String[] args) {
//        获取10个1~100之间的随机数存入数组 保证不重复
        Random r = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            int rand;
            while (true) {
                boolean f = true;
                rand = r.nextInt(0, 101);
                for (int j = 0; j < i; j++)
                    if (a[j] == rand) {
                        f = false;
                        break;
                    }
                if (f) break;
            }
            a[i] = rand;
        }
        for (int i : a)
            System.out.print(i + " ");
    }
}
