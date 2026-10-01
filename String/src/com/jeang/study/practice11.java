package com.jeang.study;

public class practice11 {
    //    金额转换为中文
//    佰拾万千佰拾元
//    零壹贰叁肆伍陆柒捌玖
    public static void main(String[] args) {
        System.out.println(numberToChinese(2135));
        String str=numberToChinese(2135);
    }

    public static String numberToChinese(int n) {
        String num = "零壹贰叁肆伍陆柒捌玖";
        String layout = "佰拾万千佰拾元";
        int len = layout.length() - 1;
        String ret = "";
        while (n > 0 && len > 0) {
            int digit = n % 10;
            ret += layout.charAt(len) + "" + num.charAt(digit) + " ";
            len--;
            n /= 10;
        }
        while (len >= 0) ret += layout.charAt(len--) + "" + num.charAt(0) + " ";
        return new StringBuilder(ret).reverse().toString();
    }
}
