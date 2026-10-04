package com.jeang.study.a03_Generics.practice;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Bosimao> list1 = new ArrayList<>();
        ArrayList<Lihuamao> list2 = new ArrayList<>();
        ArrayList<Taidigou> list3 = new ArrayList<>();
        ArrayList<Hasiqigou> list4 = new ArrayList<>();
    }

    //    泛型通配符
    //    泛型不具备继承性 但是数据具备继承性
    //    ? extends T 接受 T 及 T 的子类
    //    ? super T 接受 T 及 T 的父类
    public static void printArrayList(ArrayList<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    //    调用所有品种的狗
    public static void keepfood1(ArrayList<? extends Dog> list) {

    }

    //    调用所有品种的猫
    public static void keepfood2(ArrayList<? extends Cat> list) {

    }

    //    调用所有动物
    public static void keepfood3(ArrayList<? extends Animal> list) {

    }
}
