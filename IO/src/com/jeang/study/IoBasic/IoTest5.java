package com.jeang.study.IoBasic;

import java.io.FileReader;
import java.io.IOException;

public class IoTest5 {
    /*
        第一步：创建对象
        public FileReader(File file)                创建字符输入流关联本地文件
        public FileReader(String pathname)          创建字符输入流关联本地文件
        第二步：读取数据
        public int read()                           读取数据，读到末尾返回-1
        public int read(char[] buffer)              读取多个数据，读到末尾返回-1
        第三步：释放资源
        public void close()                         释放资源/关流
    */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\demoFile\\demo");
        char[] c = new char[1024];
        int len;
        while ((len = fr.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
    }
}
