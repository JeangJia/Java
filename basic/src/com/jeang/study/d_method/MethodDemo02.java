package com.jeang.study.d_method;

import java.util.Random;

public class MethodDemo02 {
    //    获取10个1~100之间的随机数 保证不重复
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; ) {
            int rand = r.nextInt(100) + 1;
            if (check(a, rand)) {
                a[i] = rand;
                i++;
            }
        }
        for (int i : a)
            System.out.print(i + " ");
    }

    public static boolean check(int[] a, int t) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == t)
                return false;
        return true;
    }
}
