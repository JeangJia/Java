package com.jeang.study.practice1;

public class Dog extends Animal{
//    构造方法
    public Dog() {
    }
    public Dog(int age, String color) {
        super(age, color);
    }
//    方法
    public void lookHome(){
        System.out.println("正在看家");
    }
}
