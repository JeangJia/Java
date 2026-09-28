package com.jeang.study;

import java.util.Random;

public class practice8 {
    /*
        验证码的内容：可以是小写字母，也可以是大写字母，还可以是数字
        验证码的规则：
        长度为 5
        内容中是四位字母，1 位数字。
        其中数字只有 1 位，但是可以出现在任意的位置。
        举例：
        正确的验证码：We1fg 6gKoq tqB2p
        错误的验证码：iuybs（没有数字） j1s2u（两个数字）
     */
    public static void main(String[] args) {
        Random r = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digitStr = "0123456789";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(letters.charAt(r.nextInt(letters.length())));
        }

        int numIndex = r.nextInt(5); // 0~4随机位置
        char numChar = digitStr.charAt(r.nextInt(digitStr.length()));
        sb.setCharAt(numIndex, numChar);
        String code = sb.toString();
        System.out.println(code);
    }
}
