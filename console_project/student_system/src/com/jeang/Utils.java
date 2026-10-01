package com.jeang;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    private Utils() {
    }

    public static void initlist(ArrayList<Student> list) {
        list.add(new Student("1001", "张三", "20", "12345678901"));
        list.add(new Student("1002", "李四", "21", "12345678902"));
        list.add(new Student("1003", "王五", "22", "12345678903"));
    }

    public static void showlist(ArrayList<Student> list) {
        System.out.println("==============================================");
        for (Student stu : list) {
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getPhone());
        }
        System.out.println("==============================================");
    }

    public static void add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        String id = sc.next();
        if (check(list, id)) {
            System.out.println("该id已存在");
            return;
        }
        System.out.println("name:");
        String name = sc.next();
        System.out.println("age:");
        String age = sc.next();
        System.out.println("phone:");
        String phone = sc.next();
        list.add(new Student(id, name, age, phone));
        System.out.println("添加成功!");
    }

    public static void del(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        String id = sc.next();
        if (!check(list, id)) {
            System.out.println("该id不存在");
            return;
        }
        for (Student stu : list) {
            if (stu.getId().equals(id)) {
                list.remove(stu);
                System.out.println("删除成功!");
            }
        }
    }

    public static void update(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        String id = sc.next();
        if (!check(list, id)) {
            System.out.println("该id不存在");
            return;
        }
        for (Student stu : list) {
            if (stu.getId().equals(id)) {
                stu.setId(id);
                System.out.println("name:");
                String name = sc.next();
                System.out.println("age:");
                String age = sc.next();
                System.out.println("phone:");
                String phone = sc.next();
                stu.setName(name);
                stu.setAge(age);
                stu.setPhone(phone);
                System.out.println("修改成功!");
                return;
            }
        }
    }

    public static void query(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        String id = sc.next();
        if (!check(list, id)) {
            System.out.println("该id不存在");
            return;
        }
        for (Student stu : list) {
            if (stu.getId().equals(id)) {
                System.out.println("查询结果:");
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getPhone());
                return;
            }
        }
    }

    public static boolean check(ArrayList<Student> list, String id) {
        for (Student st : list) {
            if (st.getId().equals(id)) return true;
        }
        return false;
    }
}
