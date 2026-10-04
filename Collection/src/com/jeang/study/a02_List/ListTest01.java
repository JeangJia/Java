package com.jeang.study.a02_List;

import java.util.List;
import java.util.ArrayList;


public class ListTest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//       list 重载了 Collection 的 remove 方法,会优先以索引为参数进行删除
        System.out.println(list.remove(0));
//       如果要删除元素,需要手动装箱
        Integer i = Integer.valueOf(2);
        System.out.println(list.remove(i));
        list.forEach(a-> System.out.println(a));
    }
}
