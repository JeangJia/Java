package com.jeang.study.ooptest2;

public class Dog {
    private String name;
    private int age;

    //    给对象属性赋值
    public void setName(String val) {
        name = val;
    }

    public void setAge(int num) {
        if (num > 0 && num < 15)
            age = num;
        else System.out.println("年龄设置错误");
    }

    //    返回对象属性的值
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + "正在吃骨头");
    }
}
