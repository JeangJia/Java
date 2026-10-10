package com.jeang.study.e_Exception;

public class Friend {
    private String name;
    private int age;

    public Friend() {
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        if (age < 18 || age > 40) {
            throw new NullPointerException("年龄不合法，必须在18到40之间，当前值为：" + age);
        }
        this.age = age;
    }
}
