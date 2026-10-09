package com.jeang.study.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class practice2 {
    // 对象->字符串
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhansan", 23));
        list.add(new Student("lisi", 24));
        List<String> newlist = list.stream().map(practice2::change).collect(Collectors.toList());
//        newlist.forEach(s-> System.out.println(s));
        newlist.forEach(System.out::println);
    }

    public static String change(Student st) {
        return st.getName() + "," + st.getAge();
    }
}
