package com.jeang.study.practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Friend[] list = new Friend[Friend.COUNT];
        Friend.initlist(list);
//    年龄大小顺序->身高->姓名
        Arrays.sort(list, (f1, f2) -> {
            if (f1.getAge() != f2.getAge())
                return f1.getAge() - f2.getAge();
            if (f1.getHeight() != f2.getHeight())
                return (int) (f1.getHeight() - f2.getHeight());
            return f1.getName().compareTo(f2.getName());
        });
        Friend.showlist(list);
    }
}
