package com.jeang.study.c_array;

import java.util.Scanner;

public class practice05 {
//    parseInt方法：将字符串转换为int整数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(parseInt(str) == Integer.parseInt(str));
    }

    public static int parseInt(String str) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            ret = ret * 10 + (str.charAt(i) - '0');
        }
        return ret;
    }
}
