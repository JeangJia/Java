package com.jeang.study.a03_Generics;

import java.util.ArrayList;

public class ListUtils {
    private ListUtils() {
    }

    //    范型方法
    public static <E> void addAll(ArrayList<E> list, E... e) {
        for (E v : e) {
            list.add(v);
        }
    }

}
