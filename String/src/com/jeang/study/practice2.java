package com.jeang.study;

import java.util.Scanner;

public class practice2 {
    /*
    键盘录入任意字符串，请按长度为 8 拆分每个输入字符串并进行输出
    长度不是 8 整数倍的字符串请在后面补数字 0，空字符串不处理。
    输入：abcdabcda
    输出：第一行：abcdabcd
        　第二行：a0000000
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int step = 8, start = 0, len = sb.length();
        while (len >= step) {
            System.out.println(sb.substring(start, start + step));
            start += step;
            len -= step;
        }
        if (len > 0) {
            System.out.print(sb.substring(start));
            for (int i = 0; i < step - len; i++) {
                System.out.print(0);
            }
        }
    }
}
