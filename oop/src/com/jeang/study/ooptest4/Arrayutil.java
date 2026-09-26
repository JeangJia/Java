package com.jeang.study.ooptest4;

public class Arrayutil {
    //    私有化构造方法，防止外部实例化
    private Arrayutil() {
    }

    static void printArray(int[] a) {
        String ret = "[";
        for (int i = 0; i < a.length; i++) {
            ret += a[i];
            if (i < a.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        System.out.println(ret);
    }

    static double getAvg(int[] a) {
        double sum = 0;
        for (int i : a) sum += i;
        return sum / a.length;
    }
}
