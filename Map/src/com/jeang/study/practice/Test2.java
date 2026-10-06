package com.jeang.study.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    //  百分之七十男百分之三十女
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<String> man = new ArrayList<>();
        ArrayList<String> woman = new ArrayList<>();
        Collections.addAll(man, "Tom", "Jerry", "Mike", "John", "Robert");
        Collections.addAll(woman, "Alice", "Bob", "Charlie", "David", "Eve");
        String s = "1111111000";
        String f = s.charAt(r.nextInt(s.length())) + "";
        String rus = "";
        String gender = "";
//      if (r.nextInt(10) < 7) 也行
        if (f.equals("1")) {
            rus = man.get(r.nextInt(man.size()));
            gender = "man";
        } else {
            rus = woman.get(r.nextInt(woman.size()));
            gender = "woman";
        }
        System.out.println(gender + " " + rus);
    }
}
