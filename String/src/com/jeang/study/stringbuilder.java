package com.jeang.study;

import java.lang.reflect.Type;

public class stringbuilder {
    /*
            字符串容器 StringBuilder
            常见成员方法：
            append（任意类型）        添加数据
            reverse()                 反转
            int length()              获取长度
            toString                  变回字符串
            setCharAt(int index, char ch)      修改指定位置的字符
    */
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("+++" + sb1 + "@@@");
        StringBuilder sb2 = new StringBuilder("Jeang");
        System.out.println(sb2);
        sb2.append(" goodby");
        System.out.println(sb2);
        String s = sb2.toString();
        System.out.println(s);
    }
}
