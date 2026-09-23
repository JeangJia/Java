package com.jeang.study.a_variable;

import java.util.Scanner;

public class Variable05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        判断一个四位数是不是回文
        System.out.println("输入一个四位数:");
        int num = sc.nextInt();
        if (num / 1000 == num % 10 && num / 100 % 10 == num / 10 % 10)
            System.out.println(num + "是回文数");
        else
            System.out.println(num + "不是回文数");
    }
}
