package com.jeang.study.IoBasic;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class practice4 {
    // 将文件 排序后写出
    public static void main(String[] args) throws IOException {
        String path = "/Users/jeang/Desktop/Study/Java/IO/src/demoFile/demo.txt";
        String pathOut = "/Users/jeang/Desktop/Study/Java/IO/src/demoFile/demo1.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] s = line.split("\\.");
            tm.put(Integer.parseInt(s[0]), line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String val = entry.getValue();
            bw.write(val);
            bw.newLine();
        }
        bw.close();
    }
}
