package com.jeang.study;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("inp:");
            String str = sc.next();
            if (str.equals("bye")) {
                System.out.println("bye!");
                break;
            }
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
        }
    }
}
