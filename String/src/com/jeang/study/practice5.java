package com.jeang.study;

public class practice5 {
    //    把任意手机号中间四位数替换为****
//    保留邮箱第一个字母,保留@后面的内容
    public static void main(String[] args) {
        String phone = "13800138000";
        String email = "jeang@qq.com";

        System.out.println(replacePhone(phone));
        System.out.println(replaceEmail(email));
    }

    public static String replacePhone(String s) {
        return s.substring(0, 3) + "****" + s.substring(7);
    }

    public static String replaceEmail(String s) {
        int ind = s.indexOf("@");
        return s.charAt(0) + "****" + s.substring(ind);
    }
}
