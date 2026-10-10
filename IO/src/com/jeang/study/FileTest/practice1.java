package com.jeang.study.FileTest;

import java.io.File;

public class practice1 {
    /*
        找到电脑中所有以 "xxx" 结尾的文件
    */
    public static void main(String[] args) {
        File[] list = File.listRoots();
        String end = ".html";
        findFile(list, end);
    }

    public static void findFile(File[] list, String end) {
        if (list == null) return;
        for (File file : list) {
            if (file.isDirectory()) {
                findFile(file.listFiles(), end);
            } else if (file.isFile() && file.getName().endsWith(end)) {
                System.out.println(file.getName());
            }
        }
    }
}
