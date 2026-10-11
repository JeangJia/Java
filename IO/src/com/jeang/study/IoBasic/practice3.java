package com.jeang.study.IoBasic;

import java.util.Random;

public class practice3 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            System.out.print(r.nextInt(100)+"-");
        }
    }
}
