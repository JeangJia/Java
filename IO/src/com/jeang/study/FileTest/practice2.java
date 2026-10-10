package com.jeang.study.FileTest;

import java.io.File;

public class practice2 {
    /*
        获取指定目录下所有文件的总大小
    */
    public static void main(String[] args) {
        String path = "src\\demoFile";
        File f = new File(path);
        System.out.println(getFileLen(f.listFiles()));
    }

    public static long getFileLen(File[] file) {
        long ret = 0;
        for (File f : file) {
            if (f.isFile()) ret += f.length();
            else ret += getFileLen(f.listFiles());
        }
        return ret;
    }
}
