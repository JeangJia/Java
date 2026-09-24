package com.jeang.study.c_array;

import java.util.Scanner;

public class ArrayDemo01 {
    public static void main(String[] args) {
//        静态初始化创建
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
//        动态初始化
        int[] b = new int[5];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < b.length; i++)
            b[i] = sc.nextInt();
    }
}
