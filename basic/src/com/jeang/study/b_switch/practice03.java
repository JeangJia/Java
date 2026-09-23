package com.jeang.study.b_switch;

import java.util.Random;
import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random r=new Random();
//        1~100之间的随机数
        int rond=r.nextInt(100)+1;
        System.out.println(rond);
        while(true){
            System.out.println("请输入一个数字：");
            int num = sc.nextInt();
            if(num > rond){
                System.out.println("大了");
            }else if(num < rond){
                System.out.println("小了");
            }else{
                System.out.println("对了！");
                break;
            }
        }
    }
}
