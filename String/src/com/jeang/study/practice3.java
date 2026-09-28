package com.jeang.study;

import java.util.Random;
import java.util.Scanner;

public class practice3 {
    //    定义一个任意的字符串,打乱字符串中的字符顺序,并输出。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String s = sc.next();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int rand = r.nextInt(a.length);
            char temp = a[i];
            a[i] = a[rand];
            a[rand] = temp;
        }
        System.out.println(new String(a));
    }
}
