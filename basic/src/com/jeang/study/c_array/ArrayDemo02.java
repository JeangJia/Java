package com.jeang.study.c_array;

import java.util.Comparator;

import java.util.Arrays;

public class ArrayDemo02 {
    /*
Arrays 数组工具类（java.util.Arrays）

// 转换
String toString(数组) 把一维数组转成字符串，如 [1, 2, 3]

// 排序
void sort(数组) 对数组升序排序
void sort(数组, from, to) 对 [from, to) 范围排序
void sort(T[] a, Comparator c) 对象数组按指定比较器排序

// 比较
boolean equals(数组1, 数组2) 比较一维数组内容是否相等
boolean deepEquals(Object[] a1, Object[] a2) 比较多维数组内容是否相等

// 复制与填充
int[] copyOf(原数组, 新长度) 复制数组到指定新长度；短则补默认值，长则截断
int[] copyOfRange(原数组, from, to) 复制 [from, to) 范围到新数组
void fill(数组, 值) 用指定值填充整个数组
void fill(数组, from, to, 值) 用指定值填充 [from, to) 范围

// 哈希与生成
int hashCode(数组) 返回一维数组哈希值
int deepHashCode(Object[] a) 返回多维数组哈希值
void setAll(数组, 生成函数) 用函数生成每个元素
void parallelSetAll(数组, 生成函数) 并行用函数生成每个元素
*/
    public static void main(String[] args) {
        Integer[] a = {234, 4, 24, 6, 23, 85};
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
