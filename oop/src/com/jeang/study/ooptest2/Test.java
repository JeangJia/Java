package com.jeang.study.ooptest2;

public class Test {
    public static void main(String[] args) {
        /*
        小狗有属性：姓名、年龄。
        行为：吃骨头
        实现以下需求
        要求 1: 小狗的年龄：0 ~ 15 岁
        要求 2: 打印小狗所有的信息：小白，2 岁
        要求 3: 调用吃骨头的方法打印效果：2 岁的小白，正在吃骨头
        */
        Dog dog = new Dog();
        dog.setName("小白");
        dog.setAge(2);
        System.out.println(dog.getName() + "," + dog.getAge() + "岁");
        dog.eat();
    }
}
