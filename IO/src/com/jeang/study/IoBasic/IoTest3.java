package com.jeang.study.IoBasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest3 {
    public static void main(String[] args) throws IOException {
        String inputPath = "src\\demoFile\\demo";
        String outputPath = "src\\test";
        int len = 1024 * 1024 * 5;
        FileInputStream fis = new FileInputStream(inputPath);
        FileOutputStream fos = new FileOutputStream(outputPath);
        byte[] bytes = new byte[len];
        while ((fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }
}
