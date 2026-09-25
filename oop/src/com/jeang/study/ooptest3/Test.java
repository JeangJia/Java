package com.jeang.study.ooptest3;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("jeang",19,"man",178);
        s2.setName("jeang");
        System.out.println(s2.getName());
    }
}
