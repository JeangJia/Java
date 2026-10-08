package com.jeang.study.a04_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        /*
            单列集合        default Stream<E> stream()               Collection中的默认方法
            双列集合        无                                       无法直接使用stream流
            数组            public static <T> Stream<T> stream(T[] array)  Arrays工具类中的静态方法
            一堆零散数据     public static<T> Stream<T> of(T... values)     Stream接口中的静态方法
        */

        // 单列集合
        ArrayList<String> al = new ArrayList<>();
        Collections.addAll(al, "Tom", "Jerry", "Mike", "John", "Robert");
//        获取一条流水线
//        Stream<String> stream = al.stream();
//        stream.forEach(s-> System.out.println(s));
        al.stream().forEach(s -> System.out.println(s));
        System.out.println("---------------");

        // 双列集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1", "Tom");
        hm.put("2", "Jerry");
        hm.put("3", "Mike");
//        通过 entrySet() 方法获取一条流水线
        hm.entrySet().stream().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
        System.out.println("---------------");

        // 数组
        String[] arr = {"Tom", "Jerry", "Mike", "John", "Robert"};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        System.out.println("---------------");

        // 一堆零散数据(需要类型相同)
        Stream.of("Tom", "Jerry", "Mike", "John", "Robert").forEach(s -> System.out.println(s));
        System.out.println("---------------");
    }
}
