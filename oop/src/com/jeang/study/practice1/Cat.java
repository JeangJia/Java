package com.jeang.study.practice1;

public class Cat extends Animal {
//  构造方法
    public Cat(){}
    public Cat(int age, String color) {
        super(age, color);
    }
//  方法
    public void catchMouse() {
        System.out.println("正在逮老鼠。");
    }
}
