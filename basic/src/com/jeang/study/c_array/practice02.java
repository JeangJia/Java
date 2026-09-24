package com.jeang.study.c_array;

import java.util.Random;

public class practice02 {
    public static void main(String[] args) {
        Random r = new Random();
//        随机打乱数组元素顺序
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            int rand = r.nextInt(a.length);
            int temp = a[i];
            a[i] = a[rand];
            a[rand] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
