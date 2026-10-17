package com.jeang.study.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class practice4 {
    public static void main(String[] args) throws Exception {
        String path = "src/com/jeang/study/practice/info.txt";        // 待点名单池
        String pathBak = "src/com/jeang/study/practice/infoTemp.txt"; // 已点名池
        Random r = new Random();
        final int N = 100;

        String src = path;     // 当前从中点人的文件
        String dst = pathBak;  // 点中的人写入的文件

        for (int i = 1; i <= N; i++) {
            ArrayList<String> list = readLines(src);
            if (list.isEmpty()) {
                // 当前池点空 -> 两个文件角色互换，从另一个池继续点
                String tmp = src;
                src = dst;
                dst = tmp;
                list = readLines(src);
                if (list.isEmpty()) {
                    System.out.println("两个文件都为空，无法继续点名");
                    break;
                }
            }
            int idx = r.nextInt(list.size());
            String picked = list.remove(idx);
            System.out.println("第" + i + "次点名: " + picked);

            // 从 src 移除点中的人并写回
            writeLines(src, list);
            // 把点中的人加入 dst 池
            ArrayList<String> called = readLines(dst);
            called.add(picked);
            writeLines(dst, called);
        }
    }

    private static ArrayList<String> readLines(String path) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) list.add(line.trim());
            }
        }
        return list;
    }

    private static void writeLines(String path, ArrayList<String> list) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
        }
    }
}
