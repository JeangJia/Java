package com.jeang.study.Test;

public class Utils {
    public static int len = 3;

    public static void showlist(Student list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getId() + "\t" + list[i].getName() + "\t" + list[i].getAge());
        }
    }

    public static boolean check(Student stu, Student list[]) {
        for (int i = 0; i < list.length; i++) {
            if (stu.getId().equals(list[i].getId()))
                return false;
        }
        return true;
    }

    public static Student[] add(Student stu, Student list[]) {
        if (!check(stu, list)) {
            System.out.println("ID 已存在!");
            return list;
        }
        Student[] ret = new Student[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            ret[i] = list[i];
        }
        ret[ret.length - 1] = stu;
        return ret;
    }

    public static Student[] del(Student stu, Student list[]) {
        if (list.length == 0) {
            System.out.println("列表为空!");
            return list;
        }
        if (check(stu, list)) {
            System.out.println("ID 不存在!");
            return list;
        }
        Student[] ret = new Student[list.length - 1];
        for (int i = 0, j = 0; i < list.length; ) {
            if (list[i].getId().equals(stu.getId())) {
                i++;
                continue;
            }
            ret[j++] = list[i++];
        }
        return ret;
    }
}
