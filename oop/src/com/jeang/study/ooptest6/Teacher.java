package com.jeang.study.ooptest6;

public class Teacher extends Person {
    String course;

    public void teach() {
        System.out.println("老师正在教" + course);
    }
}
