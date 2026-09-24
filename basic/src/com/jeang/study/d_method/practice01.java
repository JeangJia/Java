package com.jeang.study.d_method;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double w=sc.nextDouble();
        double price=0;
        if(w<=1)price=10;
        else if(w>1&&w<=5)price=10+one_five(w-1);
        else price=10+one_five(4)+five_(w-5);
        System.out.println(price);
    }
    public static double one_five(double w){
        return w*2;
    }
    public static double five_(double w){
        return w*1.5;
    }

}
