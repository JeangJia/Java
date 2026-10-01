package com.jeang.study.Test;

public class Test {
    public static void main(String[] args) {
        Student[] list = new Student[Utils.len];
        list[0] = new Student("001", "Alice", 18);
        list[1] = new Student("002", "Bob", 19);
        list[2] = new Student("003", "Charlie", 20);

        list = Utils.add(new Student("004", "David", 21), list);
        list = Utils.add(new Student("005", "Eve", 22), list);
        Utils.showlist(list);

        list = Utils.del(new Student("002", "Bob", 19), list);
        Utils.showlist(list);
    }
}
