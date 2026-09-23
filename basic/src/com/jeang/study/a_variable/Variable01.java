package com.jeang.study.a_variable;

import java.util.Scanner;

public class Variable01 {
    public static void main(String[] args) {
        // 创建一个 Scanner 类的对象
        Scanner sc = new Scanner(System.in);
        // 通过Scanner类获取用户输入
        int num = sc.nextInt(); // 整数
        System.out.println(num);
        double d = sc.nextDouble(); // 浮点数
        System.out.println(d);
        String str = sc.next(); // 字符串
        System.out.println(str);
    }
}
