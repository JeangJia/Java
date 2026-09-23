package com.jeang.study.b_switch;

import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month (1-12):");
        int month=sc.nextInt();
        switch(month){
            case 1,2,12 -> System.out.println("winter");
            case 3,4,5 -> System.out.println("spring");
            case 6,7,8 -> System.out.println("summer");
            case 9,10,11 -> System.out.println("autumn");
            default -> System.out.println("invalid month");
        }
    }
}
