package com.jeang.study.basics;

import java.util.Random;

public class GetYzm {
    public static String getyzm() {
        /*
            获取验证码
            六位前五位为字母，后一位为数字
        */
        int len = 6;
        String l = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String g = "0123456789";
        String ret = "";
        Random r = new Random();
        for (int i = 1; i < len; i++) {
            ret += l.charAt(r.nextInt(l.length()));
        }
        ret += g.charAt(r.nextInt(g.length()));
        return ret;
    }
}
