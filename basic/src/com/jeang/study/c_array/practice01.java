package com.jeang.study.c_array;

public class practice01 {
    public static void main(String[] args) {
//        求数组中的最大值
        int[] a = {33, 44, 23, 56, 21};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        System.out.println("max = " + max);
    }
}
