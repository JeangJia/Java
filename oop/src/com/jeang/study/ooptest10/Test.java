package com.jeang.study.ooptest10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        普通
        Sw s = new Sw();
        goswimming(s);
//        匿名内部类
        goswimming(new Swim() {
            @Override
            public void swimming() {
                System.out.println("I am swimming");
            }
        });
    }

    public static void goswimming(Swim s) {
        s.swimming();
    }
}
