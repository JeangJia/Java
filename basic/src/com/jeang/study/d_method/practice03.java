package com.jeang.study.d_method;

public class practice03 {
    //    给定两个正序数组合并后 求新数组的中位数
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 10};
        int len = a1.length + a2.length;
        int[] a3 = new int[len];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                a3[k] = a1[i];
                i++;
            } else {
                a3[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < a1.length) {
            a3[k] = a1[i];
            i++;
            k++;
        }
        while (j < a2.length) {
            a3[k] = a2[j];
            j++;
            k++;
        }
        if (len % 2 == 0)
            System.out.println((a3[len / 2] + a3[len / 2 - 1]) / 2.0);
        else
            System.out.println(a3[len / 2]);
    }
}
