package com.jeang.study.FileTest;

import java.io.File;
import java.util.HashMap;

public class practice3 {
    /*
        统计一个文件夹中每种文件的个数并打印
    */
    public static void main(String[] args) {
        String path = ".\\";
        File f = new File(path);
        HashMap<String, Integer> map = new HashMap<>();
        countFile(f.listFiles(), map);
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }

    public static void countFile(File[] a, HashMap<String, Integer> map) {
        if (a == null) return;
        for (File f : a) {
            if (f.isFile()) {
                String name = f.getName();
                int dot = name.lastIndexOf(".");
                if (dot == -1) continue;
                String key = name.substring(dot + 1);
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            } else countFile(f.listFiles(), map);
        }
    }
}
