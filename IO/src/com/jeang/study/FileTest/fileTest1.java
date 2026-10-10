package com.jeang.study.FileTest;

import java.io.File;

public class fileTest1 {
    /*
        public File(String pathname)                根据文件路径创建文件对象
        public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象
    */
    public static void main(String[] args) {
        String path = "src\\test";
        File file = new File(path);
//        拼接路径
        File file1 = new File("src\\demoFile", "demo");
        System.out.println(file.isFile());
        System.out.println(file1.isFile());
    }
}
