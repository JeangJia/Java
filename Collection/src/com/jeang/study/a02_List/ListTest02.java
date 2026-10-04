package com.jeang.study.a02_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest02 {
/*  五种遍历
    1.迭代器
    2.列表迭代器
    3.增强for
    4.lambda
    5.普通for
 */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

//        1.迭代器 遍历过程中可以删除元素 it.remove()
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        2.列表迭代器 遍历过程中可以添加元素也可以删除元素 lit.add(); lit.remove();
        Iterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
//        3.增强for
        for (String s : list) {
            System.out.println(s);
        }
//        4.lambda
        list.forEach(s -> System.out.println(s));
//        5.普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
