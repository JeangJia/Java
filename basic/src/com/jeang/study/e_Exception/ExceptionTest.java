package com.jeang.study.e_Exception;

public class ExceptionTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            System.out.println(a[3]);
            System.out.println(1 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
        } catch (Exception e) {
            // 打印异常信息
            e.printStackTrace();
            System.out.println("其他异常" + e);
        } finally {
            System.out.println("finally块中的代码总是会执行");
        }
    }
}
