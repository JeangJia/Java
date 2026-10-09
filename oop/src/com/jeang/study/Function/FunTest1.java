package com.jeang.study.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4");
        // 引用静态方法
        list.stream().map(Integer::parseInt)
                .forEach(s -> System.out.println(s));

    }
}
