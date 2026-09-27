package com.jeang.study.ooptest9;

public class Graduate_Student extends Person {
    private int grade;

    //    构造方法
    public Graduate_Student() {
    }

    public Graduate_Student(String name, int age, int grade) {
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
        System.out.println("攻读硕士学位");
    }

    @Override
    public void sleep() {
        System.out.println("在豪华学生公寓睡觉");
    }
}
