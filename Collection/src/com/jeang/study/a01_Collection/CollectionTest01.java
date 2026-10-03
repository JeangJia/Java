package com.jeang.study.a01_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
//        增强for
        System.out.println("--------------------------");
        for (String s : list) {
            System.out.println(s + " ");
        }
        System.out.println("--------------------------");
//        创建迭代器 (不会复位)
        Iterator<String> it = list.iterator();
//        hasNext() 判断是否为空
        while (it.hasNext()) {
//            next() 获取当前元素,并移动到下一个元素
            System.out.println(it.next() + " ");
        }
        System.out.println("--------------------------");
//        lambda 表达式
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s+" ");
            }
        });
        list.forEach(s -> System.out.println(s + " "));
    }
}
