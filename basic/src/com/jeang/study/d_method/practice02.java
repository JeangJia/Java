package com.jeang.study.d_method;

import java.util.Random;
import java.util.Scanner;

public class practice02 {
    /*
        给你两个整数 M 和 N，M 表示红包的总额，N 表示红包的个数
        现在有 N 个人来抽红包，每个人都是随机的，打印每个人领的红包金额
        注 1：每个人最少 1 分钱
        注 2：每个人领完红包之后，至少预留 1 * N 分钱
        注 3：最后一个人是拿剩余的总额
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean flag = true;
        if (m * 100 < n) {
            System.out.println("Invalid input");
            flag = false;
        }
        int totalFen = m * 100;
        while (n > 1 && flag) {
            int max = totalFen - (n - 1) * 1;
            int get = r.nextInt(max) + 1;
            System.out.print(get / 100.0 + " ");
            totalFen -= get;
            n--;
        }
        System.out.print(totalFen / 100.0);
        sc.close();
    }
}
