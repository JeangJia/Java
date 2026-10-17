package com.jeang.study.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class practice2 {
//    点名男生和女生的比例 7:3
    static int boyCount = 0;
    static int girlCount = 0;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000000; i++)
            test();
        System.out.println(boyCount + " " + girlCount);
    }

    public static void test() throws IOException {
        String path = "src/com/jeang/study/practice/info.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<String> list = new ArrayList<>();
        while (br.ready()) list.add(br.readLine());
        ArrayList<String> boy = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();
        list.forEach(s -> {
            String[] arr = s.split("-");
            if (arr[1].equals("男")) boy.add(s);
            else girl.add(s);
        });
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String temp = "1111111000";
        String f = String.valueOf(temp.charAt(r.nextInt(temp.length())));
        if (f.equals("1")) {
//            System.out.println(boy.get(r.nextInt(boy.size())));
            practice2.boyCount++;
        } else {
//            System.out.println(girl.get(r.nextInt(girl.size())));
            practice2.girlCount++;
        }
        br.close();
    }
}
