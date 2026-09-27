package com.jeang.study.practice1;

public class Animal {
    private int age;
    private String color;

//    构造函数
    public Animal(){}
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }
//    get/set

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    方法
    public void eat(String food){
        System.out.println("正在吃" + food + "。");
    }
}
