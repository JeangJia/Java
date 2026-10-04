package com.jeang.study.a03_Generics.practice;

public class Lihuamao extends Cat {
    public Lihuamao() {
    }

    public Lihuamao(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("一只叫" + getName() + "的狸花猫正在吃" + food);
    }
}
