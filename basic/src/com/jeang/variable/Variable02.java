package com.jeang.variable;

import java.util.Scanner;

public class Variable02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入你的身高：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("你的BMI指数是：" + bmi);
    }
}
