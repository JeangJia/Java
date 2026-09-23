package com.jeang.study.b_switch;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class for02 {
    public static void main(String[] args) {
//        统计既能被三整除又能被五整除的数的个数
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;
        for (int i = l; i <= r; i++)
            if (i % 3 == 0 && i % 5 == 0)
                count++;
        System.out.println(count);
    }
}
