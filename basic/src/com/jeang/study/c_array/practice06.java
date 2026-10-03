package com.jeang.study.c_array;

public class practice06 {
    //    toBinaryString方法：将int整数转换为二进制字符串
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(toBinary(n));
        System.out.println(toBinary(n).equals(Integer.toBinaryString(n)));
    }

    public static String toBinary(int num) {
        String ret = "";
        int n = num;
        while (n != 0) {
            ret += n % 2 + "";
            n /= 2;
        }
        return new StringBuilder(ret).reverse().toString();
    }
}
