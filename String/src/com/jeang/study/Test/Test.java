package com.jeang.study.Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Jeang", 18));
        list.add(new Student(2, "Jeang2", 19));
        list.add(new Student(3, "Jeang3", 20));
        list.add(new Student(0, "Jeang4", 21));
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            System.out.print(st.getId() + " " + st.getName() + " " + st.getAge() + " ");
            System.out.println(getStudentInfo(list, st.getId()));
        }
    }

    public static int getStudentInfo(ArrayList<Student> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            if (st.getId() == id) return i;
        }
        return -1;
    }
}
