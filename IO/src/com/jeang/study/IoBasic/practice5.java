package com.jeang.study.IoBasic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice5 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/jeang/Desktop/Study/Java/IO/src/demoFile/count.txt";
        FileReader fr = new FileReader(path);
        int cnt = Integer.parseInt(String.valueOf(fr.read()))-'0';
        fr.close();
        if (cnt >= 3) {
            System.out.println("已经登录三次!");
            return;
        }
        cnt+=1;
        System.out.println("你已经登录"+cnt+"次"+", 最多免费3次!");
        FileWriter fw=new FileWriter(path);
        fw.write(cnt+'0');
        fw.close();
    }
}
