package com.jeang.study.ooptest6;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.grade = "高三";
        s1.eat();
        s1.study();
        System.out.println(s1.name + " " + s1.age + " " + s1.grade);
        System.out.println("--------");
        Teacher t1 = new Teacher();
        t1.name = "张老师";
        t1.age = 30;
        t1.course = "数学";
        t1.eat();
        t1.teach();
        System.out.println(t1.name + " " + t1.age + " " + t1.course);
    }
}
