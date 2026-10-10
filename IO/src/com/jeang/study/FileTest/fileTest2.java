package com.jeang.study.FileTest;

import java.io.File;

public class fileTest2 {
    public static void main(String[] args) {
        /*
            public boolean isDirectory()        判断此路径名表示的File是否为文件夹
            public boolean isFile()             判断此路径名表示的File是否为文件
            public boolean exists()             判断此路径名表示的File是否存在

            public long length()                返回文件的大小（字节数量）
            public String getAbsolutePath()     返回文件的绝对路径
            public String getPath()             返回定义文件时使用的路径
            public String getName()             返回文件的名称，带后缀
            public long lastModified()          返回文件的最后修改时间（时间毫秒值）

            public boolean createNewFile()    创建一个新的空的文件
            public boolean mkdir()            创建单级文件夹
            public boolean mkdirs()           创建多级文件夹
            public boolean delete()           删除文件、空文件夹
        */
        String path = "src\\test";
        File file = new File(path);
        System.out.println(file.isDirectory()); // 判断此路径名表示的File是否为文件夹
        System.out.println(file.isFile()); // 判断此路径名表示的File是否为文件
        System.out.println(file.exists()); // 判断此路径名表示的File是否存在

        System.out.println(file.length()); // 文件的大小（字节数量）
        System.out.println(file.getAbsolutePath()); // 文件的绝对路径
        System.out.println(file.getPath()); // 定义文件时使用的路径
        System.out.println(file.getName()); // 文件的名称，带后缀
        System.out.println(file.lastModified()); // 文件的最后修改时间（时间毫秒值）

        try {
            System.out.println(file.createNewFile()); // 创建一个新的空的文件
            System.out.println(file.mkdir()); // 创建单级文件夹
            System.out.println(file.mkdirs()); // 创建多级文件夹
            System.out.println(file.delete()); // 删除文件、空文件夹
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
