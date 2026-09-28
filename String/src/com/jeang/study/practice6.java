package com.jeang.study;

public class practice6 {
    //    求字符出现的次数 不区分大小写
    public static void main(String[] args) {
        String str = "aAbsaAAsdfa";
        char c = 'a';
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c || c - str.charAt(i) == 32) ret++;
        }
        System.out.println(ret);
    }
}
