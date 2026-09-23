package com.jeang.study.b_switch;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 7 || i % 7 == 0) {
                System.out.println("out");
                continue;
            }
            System.out.println(i);
        }
    }
}
