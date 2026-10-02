package com.jeang.study.Test;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The cat is eating " + food);
    }

    public void catchMouse() {
        System.out.println("The cat is catching a mouse");
    }
}
