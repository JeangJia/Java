package com.jeang.study.FileTest;

import java.io.File;

public class fileTest3 {

    /*
        public static File[] listRoots()                列出可用的文件系统根
        public String[] list()                          获取当前该路径下所有内容
        public String[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
        (常用)public File[] listFiles()               获取当前该路径下所有内容
        public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
        public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
    */
    public static void main(String[] args) {
        String path = "src\\demoFile";
        File f = new File(path);
//        listFiles() 获取当前该路径下所有内容
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt"))
                System.out.println(file);
        }
//        listFiles(FileFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        File[] arr = f.listFiles(s -> s.getName().endsWith(".txt"));
        for (File file : arr) {
            System.out.println(file);
        }
//        listFiles(FilenameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        File[] arr2 = f.listFiles((dir, name) -> name.endsWith(".txt"));
        for (File file : arr2) {
            System.out.println(file);
        }
    }
}
