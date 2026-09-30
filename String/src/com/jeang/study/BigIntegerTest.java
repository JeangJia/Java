package com.jeang.study;

import java.math.BigInteger;

public class BigIntegerTest {
    /*
        常见的成员方法：
        public BigInteger    add(BigInteger val)          加法
        public BigInteger    subtract(BigInteger val)     减法
        public BigInteger    multiply(BigInteger val)     乘法
        public BigInteger    divide(BigInteger val)       除法，获取商
        public BigInteger[]  divideAndRemainder(BigInteger val) 除法，获取余数
        public boolean       equals(Object x)             比较
        public BigInteger    pow(int exponent)            次方
        public BigInteger    max/min(BigInteger val)      最大值/最小值

1. BigInteger 是**不可变对象**，所有运算方法都会返回**新 BigInteger 对象**，原对象不变。
2. `divideAndRemainder` 返回数组：`[0]是商，[1]是余数`。
3. 比较大小除了`equals`，还有`compareTo()`方法（返回 int，大于 > 0，等于 = 0，小于 < 0）。
    */

    public static void main(String[] args) {
//     构造方法获取
        BigInteger bi = new BigInteger("12345678901234567890");
//     静态方法获取
//     当`Biginteger`加载到内存时,提前把-16~16之间每一个数字都创建了对象,一共33个
//      .valueOf()里面不能超过 long 范围
        BigInteger bi1 = BigInteger.valueOf(999999999);
        BigInteger bi2 = bi.multiply(bi1);
        System.out.println(bi2);
    }
}
