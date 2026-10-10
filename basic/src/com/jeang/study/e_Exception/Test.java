package com.jeang.study.e_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Friend f = new Friend();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter name:");
                f.setName(sc.nextLine());
                System.out.println("Enter age:");
                f.setAge(sc.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("年龄必须输入整数");
                sc.next(); // 清掉非法输入，否则下次循环还会读到同一个错误token
                e.printStackTrace();
            } catch (RuntimeException e) {
                System.out.println("捕获到异常：" + e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println(f.getName() + " " + f.getAge());
    }
}
