package com.jeang.study.b_switch;

import java.util.Scanner;

public class while02 {
    //    数位之和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n < 0 ? -n : n;
        int sum = 0;
        while (n > 0) {
            int t = n % 10;
            sum += t;
            n /= 10;
        }
        System.out.println(sum);
    }
}
