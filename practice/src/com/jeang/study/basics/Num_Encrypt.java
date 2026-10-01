package com.jeang.study.basics;

public class Num_Encrypt {
    public static int encrypt(int num) {
        /*
            加密规则：
            1. 先得到每位数都加上5,再对10取余。
            2. 然后将得到的数进行反转。
        */
        int ret = 0;
        while (num > 0) {
            ret = ret * 10 + (num % 10 + 5) % 10;
            num /= 10;
        }
        return ret;
    }

    public static int decode(int num) {
        int ret = 0;
        while (num > 0) {
            int t = num % 10;
            ret = ret * 10 + (t < 5 ? t + 5 : t - 5);
            num /= 10;
        }
        return ret;
    }
}
