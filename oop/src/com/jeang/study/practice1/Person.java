package com.jeang.study.practice1;

public class Person {
    private String name;
    private int age;

    //    构造方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    get/set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    方法
    public void keepPet(Animal animal, String food) {
        animal.eat(food);
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.lookHome();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
