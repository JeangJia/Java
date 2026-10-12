package com.jeang.study.IoBasic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice3 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/jeang/Desktop/Study/Java/IO/src/test.txt";
        File f = new File(path);
        if (f.isFile()) System.out.println("yes");
        FileReader fr = new FileReader(path);
        char[] files = new char[1024*1024];
        int len;
        String str = "";
        while ((len = fr.read(files)) != -1)
            str += new String(files, 0, len);
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(str.split("-")).map(Integer::parseInt).collect(Collectors.toList());
//        list.sort((a, b) -> a - b);
        list.stream().filter(s->s<10).collect(Collectors.toList()).forEach(s-> System.out.println(s));

    }
}
