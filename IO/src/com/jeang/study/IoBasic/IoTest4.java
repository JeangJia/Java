package com.jeang.study.IoBasic;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IoTest4 {
    /*
    Java中编码的方法
        public byte[] getBytes()                使用默认方式进行编码
        public byte[] getBytes(String charsetName) 使用指定方式进行编码
    Java中解码的方法
        String(byte[] bytes)                    使用默认方式进行解码
        String(byte[] bytes, String charsetName) 使用指定方式进行解码
    */

    public static void main(String[] args) {
        String str = "爱你";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes2 = {-27, -120, -104, -24, -74, -123, -26, -91, -96};
        String s = new String(bytes2, StandardCharsets.UTF_8);
        System.out.println(s);
    }
}
