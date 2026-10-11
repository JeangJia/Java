package com.jeang.study.IoBasic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice2 {
    // 将文件中的数字按降序排序并写回文件 数字通过'-'连接
    public static void main(String[] args) throws IOException {
        String str = "";
        String path = "src\\test.txt";
        FileReader fr = new FileReader(path);
        char[] c = new char[10];
        int len;
        while ((len = fr.read(c)) != -1) {
            str += new String(c, 0, len);
        }
        str = str.trim();
        List<Integer> arr = Arrays.stream(str.split("-"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        arr.sort((a, b) -> b - a);
        String outputStr = arr.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("-"));
        FileWriter fw = new FileWriter(path);
        fw.write(outputStr);
        fw.close();
        fr.close();
    }
}
