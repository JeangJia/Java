package com.jeang.study.ooptest1;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "iPhone";
        phone.color = "white";
        phone.price = 8000.0;
        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);
        phone.call("1234567890");
    }
}
