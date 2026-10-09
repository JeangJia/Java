package com.jeang.study.Function;

import java.util.*;
import java.util.stream.Collectors;

public class FunTest1 {
    public static void main(String[] args) {
        new FunTest1().test();
        new FunTest1().test1();
    }

    public void test() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "19", "22", "12", "4");
        // 引用静态方法
        List<Integer> newlist = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        // 引用本类方法
        newlist.sort(this::sub);
        newlist.forEach(s -> System.out.println(s));
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public void test1() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,20", "lisi,21", "wangwu,22");
//        引用构造方法(需要添加对应的构造方法)
        List<Student> newlist = list.stream().map(Student::new).collect(Collectors.toList());
        newlist.forEach(s -> System.out.println(s.getName() + " " + s.getAge()));
    }


}
