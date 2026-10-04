package com.jeang.study.a03_Generics.practice;

public class Hasiqigou extends Dog {
    public Hasiqigou() {
    }

    public Hasiqigou(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("一只叫" + getName() + "的哈士奇正在吃" + food);
    }
}
