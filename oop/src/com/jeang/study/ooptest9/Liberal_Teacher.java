package com.jeang.study.ooptest9;

public class Liberal_Teacher extends Person {
    //    构造方法
    public Liberal_Teacher() {
    }

    public Liberal_Teacher(String name, int age) {
        super(name, age);
    }

    //    get/set

    //    方法
    public void teach() {
        System.out.println("教通识课知识");
    }
}
