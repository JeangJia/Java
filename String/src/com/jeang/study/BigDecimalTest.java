package com.jeang.study;

import java.math.BigDecimal;

public class BigDecimalTest {
/*
    常见的成员方法：
    public BigDecimal    add(BigDecimal val)          加法
    public BigDecimal    subtract(BigDecimal val)     减法
    public BigDecimal    multiply(BigDecimal val)     乘法
    public BigDecimal    divide(BigDecimal val)       除法，获取商
    public BigDecimal[]  divideAndRemainder(BigDecimal val) 除法，获取商和余数
    public boolean       equals(Object x)             比较
    public BigDecimal    pow(int exponent)            次方
    public BigDecimal    max/min(BigDecimal val)      最大值/最小值
*/

    public static void main(String[] args) {
//        构造方法获取(传字符串)
        BigDecimal bd = new BigDecimal("1.9");
        System.out.println(bd);
//        静态方法获取
//        0~10是提前创建好的
        BigDecimal bd2 = BigDecimal.valueOf(1.9);
        System.out.println(bd2);
        System.out.println(bd.multiply(bd2));
    }
}
