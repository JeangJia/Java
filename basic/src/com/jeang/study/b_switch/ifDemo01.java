package com.jeang.study.b_ifDemo;

import java.util.Scanner;

public class ifDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1.九折优惠
//        2.满100减20
        System.out.println("花费:");
        double price = sc.nextDouble();
        double a = price * 0.9;
        double b = price > 100 ? price - 20 : price;
        if (a > b)
            System.out.println('a');
        else
            System.out.println('b');
    }
}
