package com.jeang.study;

import java.util.Scanner;

public class practice10 {
    //    判断自幂数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int inp = sc.nextInt();
            if (inp == 0) break;
            if (isArmstrong(inp))
                System.out.println(inp + " 是自幂数");
            else
                System.out.println(inp + " 不是自幂数");
        }
    }

    public static boolean isArmstrong(int n) {
        int tem = n;
        int r = 0;
        while (tem > 0) {
            tem /= 10;
            r++;
        }
        int f = n;
        int sum = 0;
        while (f > 0) {
            int d = f % 10;
            sum += Math.pow(d, r);
            f /= 10;
        }
        return sum == n;
    }
}
