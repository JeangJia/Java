package com.jeang.study.a03_Generics.practice;

public class Bosimao extends Cat {
    public Bosimao() {
    }

    public Bosimao(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("一只叫" + getName() + "的波斯猫正在吃" + food);
    }
}
