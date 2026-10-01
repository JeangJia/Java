package com.jeang.study.Test;

import com.jeang.study.basics.GetYzm;
import com.jeang.study.basics.Num_Encrypt;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Num_Encrypt.encrypt(1983));
        System.out.println(Num_Encrypt.decode(8346));
    }
}
