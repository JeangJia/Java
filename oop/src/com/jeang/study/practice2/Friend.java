package com.jeang.study.practice2;

import java.util.ArrayList;

public class Friend {
    private String name;
    private int age;
    private double height;

    static int COUNT = 5;

    public static void initlist(Friend[] list) {
        list[0] = new Friend("zhangsan", 19, 187);
        list[1] = new Friend("lisi", 20, 177);
        list[2] = new Friend("wangwu", 20, 167);
        list[3] = new Friend("zhaoliu", 22, 157);
        list[4] = new Friend("qianqi", 22, 157);
    }

    public static void showlist(Friend[] list) {
        for (Friend f : list) {
            System.out.println(f.getAge() + " " + f.getHeight() + " " + f.getName());
        }
    }

    public Friend() {
    }

    public Friend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
