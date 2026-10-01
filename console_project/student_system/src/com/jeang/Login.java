package com.jeang;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void login() {
        ArrayList<User> list = new ArrayList<>();
        UserUtils.init(list);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========欢迎登录========");
            System.out.println("0.显示用户");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.找回密码");
            System.out.println("4.退出");
            int inp = sc.nextInt();
            switch (inp) {
                case 0 -> UserUtils.showUsers(list);
                case 1 -> UserUtils.login(list);
                case 2 -> UserUtils.register(list);
                case 3 -> UserUtils.findPassword(list);
                case 4 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }
        }
    }
}
