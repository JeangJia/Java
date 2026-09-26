package com.jeang.study.opptest7;

public class Test {
    /*
        现在有三个电子设备，请设计他们的继承结构
        安卓手机：
            属性：品牌，价格，
            行为：打电话，发短信，nfc功能
        苹果手机：
            属性：品牌，价格
            行为：打电话，发短信
        笔记本电脑：
            属性：品牌，价格
            行为：编程
    */
    public static void main(String[] args) {
//        安卓
        Android android = new Android();
        android.brand = "华为";
        android.price = 3000;
        android.call();
        android.sendMessage();
        android.useNFC();
//        苹果
        IOS iphone = new IOS();
        iphone.brand = "苹果";
        iphone.price = 5000;
        iphone.call();
        iphone.sendMessage();
//        笔记本
        Notebook notebook = new Notebook();
        notebook.brand = "戴尔";
        notebook.price = 6000;
        notebook.coding();
    }
}
