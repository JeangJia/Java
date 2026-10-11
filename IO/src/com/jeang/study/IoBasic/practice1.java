package com.jeang.study.IoBasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class practice1 {
    //    文件加密
    public static void main(String[] args) throws IOException {
        String inputPath = "src\\girl.jpg";
        String outputPath = "src\\encry.jpg";
        final int n = 10;
        FileInputStream fis = new FileInputStream(inputPath);
        FileOutputStream fos = new FileOutputStream(outputPath);
        int f;
        while ((f = fis.read()) != -1) {
            fos.write(f ^ n);
        }
        fos.close();
        fis.close();
    }
}
