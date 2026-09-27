package com.jeang.study.ooptest9;

public class Common_Student extends Person {
    private int grade;

    //    构造方法
    public Common_Student() {
    }

    public Common_Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    //    get/set
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //    方法
    public void study() {
        System.out.println("攻读学士学位");
    }
}
