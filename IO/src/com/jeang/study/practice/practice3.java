package com.jeang.study.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class practice3 {
    //    每次随机点一名(第n次必须是xxx)
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入n和xxx，用空格隔开(第n次必须是xxx)");
        int n = sc.nextInt();
        String name = sc.nextLine().trim();
        String path = "src/com/jeang/study/practice/info.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<String> list = new ArrayList<>();
        while (br.ready()) list.add(br.readLine());

        int count = 0;
        System.out.println("按回车随机点一名，输入 exit 退出");
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            count++;
            System.out.println(count);
            if (count == n) {
                findName(list, name);
            } else {
                String out = list.get(r.nextInt(list.size()));
                System.out.println(out);
            }
        }
        br.close();
    }

    private static void findName(ArrayList<String> list, String name) {
        for (String s : list) {
            String[] t = s.split("-");
            if (t[0].equals(name)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("没有!");
    }
}
