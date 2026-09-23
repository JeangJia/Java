package com.jeang.study.b_switch;

import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        for (int i = 0; i < h; i++) {
            {
                for (int k = 0; k < h - i; k++)
                    System.out.print(" ");
                for (int j = h; j > 0; j--)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

