package com.jeang.study;

public class common {
    /*
        String 类当中常见的方法：
            比较                 equals  equalsIgnoreCase
            长度                 length
            获取单个字符          charAt
            截取                 substring
            替换                 replace

            是否包含             contains
            判断开头、结尾        startsWith/endsWith
            查找                indexOf(int ch)    lastIndexOf(int ch)
            判断是否为空         isEmpty()
            转字符数组           toCharArray()
            大小写转换           toUpperCase() 、 toLowerCase()
            去除头尾空格         trim()
    */
    public static void main(String[] args) {
//        字符串本身不能被改变
        String str1 = "Jeang";
        String str2 = "jeang";
//        equals()
        System.out.println(str1.equals(str2));
//        不区分大小写
        System.out.println(str1.equalsIgnoreCase(str2));
//        提取字符串长度 length()
        for (int i = 0; i < str1.length(); i++) {
//            charAt 获取字符串里面的字符
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();
        String str3 = "Hello Jeang";
//        substring() 截取字符串
        String str4 = str3.substring(6);
        System.out.println(str4);
//        replace() 替换
        String str5 = str3.replace("Hello", "goodby");
        System.out.println(str5);

    }
}
