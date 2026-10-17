package com.jeang.study.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class practice1 {
    //    每次随机点一名
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String path = "src/com/jeang/study/practice/info.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<String> list = new ArrayList<>();
        while (br.ready()) {
            list.add(br.readLine());
        }
        System.out.println("按回车随机点一名，输入 exit 退出");
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            String out = list.get(r.nextInt(list.size()));
            System.out.println(out);
        }
        br.close();
    }
}
