package com.jeang.study.IoBasic;

import java.io.FileInputStream;
import java.io.IOException;

public class IoTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\test");
//        只会读取一个字节 如果读到文件末尾返回-1
//        System.out.println((char) fis.read());
        int data;
        while ((data = fis.read()) != -1){
            System.out.print((char) data);
        }
        fis.close();
    }
}
