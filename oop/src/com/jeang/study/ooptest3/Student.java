package com.jeang.study.ooptest3;

public class Student {
    //    私有化成员变量
    private String name;
    private int age;
    private String gender;
    private int height;

    //    空参构造方法
    public Student() {

    }

    //    带全部参数构造方法
    public Student(String name, int age, String gender, int height) {
        this.name = name;
        if (this.name.equals("jeang")) this.name = "1900";
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    //    set/get
    public void setName(String name) {
        if (this.name == "jeang") {
            this.name = "1900";
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
