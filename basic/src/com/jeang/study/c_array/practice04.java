package com.jeang.study.c_array;

public class practice04 {
    public static void main(String[] args) {
//        给定一个递增有序数组,去除重复元素
        int[] a = {1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9, 9, 9, 10};
        int l = 0, r = 1;
        while (r < a.length) {
            if (a[l] != a[r]) {
                a[++l] = a[r];
            }
            r++;
        }
        for (int i = 0; i <= l; i++)
            System.out.print(a[i] + " ");
    }
}
