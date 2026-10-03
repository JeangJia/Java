package com.jeang.study.c_array;

import java.util.Scanner;

public class IntegerDemo03 {
    public static void main(String[] args) {
//        自动装箱与拆箱
        Integer i1 = 16;
        int i2 = i1;
        System.out.println(i2);
//        常用成员方法
//        转换
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toOctalString(i1));
        System.out.println(Integer.toHexString(i1));
//        将字符串转换为int整数
        System.out.println(Integer.parseInt("19"));
        System.out.println("nextline类型转换:");
        String line = new Scanner(System.in).nextLine();
        double l = Double.parseDouble(line);
        System.out.println(l);
    }
}
