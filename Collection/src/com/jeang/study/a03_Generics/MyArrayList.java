package com.jeang.study.a03_Generics;

import java.util.Arrays;

public class MyArrayList<E> {
    int len = 10;
    Object[] list = new Object[len];
    int size;

    public boolean add(E e) {
        if (size == len)
            return false;
        list[size++] = e;
        return true;
    }

    public E get(int index) {
        return (E) list[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
