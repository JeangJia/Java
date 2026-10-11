package com.jeang.study.IoBasic;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest1 {
    /*
        void write(int b)                    一次写一个字节数据
        void write(byte[] b)                 一次写一个字节数组数据
        void write(byte[] b, int off, int len) 一次写一个字节数组的部分数据
    */
    public static void main(String[] args) throws IOException {
        FileOutputStream ofs = new FileOutputStream("src\\test");
        ofs.write("hello world ".getBytes());

        byte[] bytes = {97, 98, 99};
        ofs.write(bytes);

        ofs.write(bytes, 1, 2);
        ofs.close();
    }
}
