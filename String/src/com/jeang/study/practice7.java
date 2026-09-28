package com.jeang.study;

import java.util.Scanner;

public class practice7 {
    /*
        将一个字符串中所有的整数前后加上符号 “*”，其他字符保持不变。连续的数字视为一个整数。
        数据范围：字符串长度满足 1 ≤ n ≤ 100
        输入描述：输入一个字符串
        输出描述：字符中所有出现的数字前后加上符号 “*”，其他字符保持不变
        示例 1
        输入:Jkdi234klowe90a3
        输出:Jkdi*234*klowe*90*a*3*
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tem = "";
        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                tem += '*';
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') tem += str.charAt(i++);
                tem += '*';
            } else {
                tem += str.charAt(i);
                i++;
            }
        }
        System.out.println(tem);
    }
}
