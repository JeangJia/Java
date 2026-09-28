package com.jeang.study;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder x = new StringBuilder(sc.next());
        x = x.reverse();
        StringBuilder y = new StringBuilder(sc.next());
        y = y.reverse();

        char[] a = x.toString().toCharArray();
        char[] b = y.toString().toCharArray();

        int lenA = a.length;
        int lenB = b.length;
        int maxLen = Math.max(lenA, lenB);

        // 结果数组多开1位，保存最高进位
        int[] rus = new int[maxLen + 1];

        for (int i = 0; i < maxLen; i++) {
            int c = (i < lenA) ? (a[i] - '0') : 0;
            int d = (i < lenB) ? (b[i] - '0') : 0;
            int sum = c + d + rus[i];
            rus[i] = sum % 10;
            rus[i + 1] = sum / 10;
        }
        int idx = rus.length - 1;
        while (idx > 0 && rus[idx] == 0) {
            idx--;
        }
        for (int i = idx; i >= 0; i--) {
            System.out.print(rus[i]);
        }
        sc.close();
    }
}
