package com.jeang.study.Test;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal a, String food) {
        if (a instanceof Dog d) {
            d.lookHome();
            d.eat(food);
        } else if (a instanceof Cat c) {
            c.catchMouse();
            c.eat(food);
        }
    }
}
