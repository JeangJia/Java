package com.jeang;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        StudentUtils.initlist(list);
        while (true) {
            System.out.println("-----------Student Management System-----------");
            System.out.println("0. Show List");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Query Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int inp = sc.nextInt();
            switch (inp) {
                case 0 -> StudentUtils.showlist(list);
                case 1 -> StudentUtils.add(list);
                case 2 -> StudentUtils.del(list);
                case 3 -> StudentUtils.update(list);
                case 4 -> StudentUtils.query(list);
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
    }
}
