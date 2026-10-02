package com.jeang.study.Test;

public class Dog extends Animal {
    public Dog() {

    }
    static{
        System.out.println("Dog static block");
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The dog is eating " + food);
    }

    public void lookHome() {
        System.out.println("The dog is looking home");
    }
}
