package com.jeang.study;

import java.util.ArrayList;

public class arraylist {
    /*
        ArrayList集合
        空参构造：
            ArrayList()            创建一个长度为0的集合
        常见方法：
            boolean add(E e)        添加数据
            void add(int index, E e) 添加数据
            boolean remove(E e)     删除元素
            E remove(int index)     删除元素
            E set(int index,E e)    修改元素
            E get(int index)        获取元素
            int size()              集合长度
    */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jeang");
        list.add("Jeang2");
        list.add(0, "Jeang0");
        System.out.println(list.remove(1));
        System.out.println(list.set(1, "Jeang1"));
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
