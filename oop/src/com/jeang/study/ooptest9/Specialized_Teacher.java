package com.jeang.study.ooptest9;

public class Specialized_Teacher extends Person {
    private String course;

    //  构造方法
    public Specialized_Teacher() {
    }

    public Specialized_Teacher(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

//    get/set

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    //    方法
    public void Specialized_teach() {
        System.out.println("教专业课");
    }
}
