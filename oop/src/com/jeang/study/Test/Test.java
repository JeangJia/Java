package com.jeang.study.Test;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("black", 1);
        Person p = new Person("Jeang", 20);
        p.keepPet(c, "mouse");
        Dog d = new Dog("white", 2);
        p.keepPet(d, "bone");
        Animal a = new Animal();
    }
}
