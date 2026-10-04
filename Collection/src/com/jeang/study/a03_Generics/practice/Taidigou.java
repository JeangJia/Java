package com.jeang.study.a03_Generics.practice;

public class Taidigou extends Dog {
    public Taidigou() {
    }

    public Taidigou(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("一只叫" + getName() + "的泰迪狗正在吃" + food);
    }
}
