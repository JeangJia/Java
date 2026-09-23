package com.jeang.study.b_switch;

import java.util.Scanner;

public class switch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        switch(i){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("跳绳");
                break;
            default:
                System.out.println("其他");
        }
    }
}
