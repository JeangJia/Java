package com.jeang.study.a_variable;

import java.util.Scanner;

public class Variable03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个三位数:");
        int num = sc.nextInt();
        System.out.println("百位:" + num / 100);
        System.out.println("十位:" + num / 10 % 10);
        System.out.println("个位:" + num % 10);
    }
}
