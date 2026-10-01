package com.jeang;

import java.util.ArrayList;
import java.util.Scanner;

public class UserUtils {

    private UserUtils() {
    }

    public static void init(ArrayList<User> list) {
        list.add(new User("Jeang", "1900", "12345678901"));
    }

    public static void showUsers(ArrayList<User> list) {
        System.out.println("======================");
        for (User user : list) {
            System.out.println(user.getUsername() + " " + user.getPwd() + " " + user.getPhone());
        }
        System.out.println("======================");
    }

    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        String name = sc.next();
        System.out.print("password:");
        String pwd = sc.next();
        if (check(list, name, pwd)) {
            System.out.println("登录成功!");
            Start.start();
        } else {
            System.out.println("登录失败!");
        }
    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        String name = sc.next();
        for (User user : list) {
            if (user.getUsername().equals(name)) {
                System.out.println("该用户已存在!");
                return;
            }
        }
        System.out.print("password:");
        String pwd = sc.next();
        System.out.print("phone:");
        String phone = sc.next();
        list.add(new User(name, pwd, phone));
        System.out.println("注册成功!");
    }

    public static void findPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入手机号:");
        String phone = sc.next();
        for (User user : list) {
            if (user.getPhone().equals(phone)) {
                System.out.print("输入新密码:");
                String newPwd = sc.next();
                user.setPwd(newPwd);
                System.out.println("修改成功!");
                return;
            }
        }
        System.out.println("手机号未找到!");
    }

    public static boolean check(ArrayList<User> list, String name, String pwd) {
        for (User user : list) {
            if (user.getUsername().equals(name) && user.getPwd().equals(pwd)) return true;
        }
        return false;
    }
}
