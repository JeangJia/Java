package com.jeang.study.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice1 {
//    字符串->对象


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhansan,23", "lisi,24", "wangwu,25");
        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }
}
