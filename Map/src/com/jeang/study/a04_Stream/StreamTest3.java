package com.jeang.study.a04_Stream;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        /*
            void forEach(Consumer action)  用于遍历流中的数据
            long count()  用于统计流中数据的个数
            toArray()  用于将流中的数据存储到数组中
        */
        ArrayList<String> al = new ArrayList<>();
        Collections.addAll(al, "张三", "李四", "王五", "赵六", "孙七", "张三岁", "张三");
        al.stream().forEach(s -> System.out.println(s));
        System.out.println(al.stream().count());
        System.out.println("---------------");
        //toArray()方法返回的是Object[]，所以需要指定类型
        String[] arr = al.stream().toArray(s -> new String[s]);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
