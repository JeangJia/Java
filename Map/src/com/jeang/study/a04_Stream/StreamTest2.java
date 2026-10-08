package com.jeang.study.a04_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
    /*
        filter        过滤
        limit         获取前几个元素
        skip          跳过前几个元素
        distinct      元素去重，依赖(hashCode和equals方法)
        Stream.concat        合并a和b两个流为一个流
        map            转换流里面数据的类型

        注意1: 中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        注意2: 修改Stream流中的数据，不会影响原来集合或者数组中的数据
    */
        ArrayList<String> al = new ArrayList<>();
        Collections.addAll(al, "张三", "李四", "王五", "赵六", "孙七", "张三岁", "张三");

        al.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(s -> System.out.println(s));
        System.out.println("---------------");
        al.stream().limit(2).forEach(s -> System.out.println(s));
        System.out.println("---------------");
        al.stream().skip(2).forEach(s -> System.out.println(s));
        System.out.println("---------------");
        al.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("---------------");
        ArrayList<String> al1 = new ArrayList<>();
        Collections.addAll(al1, "a-10", "b-20", "c-30", "d-40");
        Stream.concat(al.stream(), al1.stream()).forEach(s -> System.out.println(s));
        System.out.println("---------------");
        al1.stream().map(s ->
                Integer.parseInt(s.split("-")[1])
        ).forEach(s -> System.out.println(s));
    }
}
