package com.jeang.study.IoBasic;

import java.io.*;

public class IoTest8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化和反序列化
        String path = "/Users/jeang/Desktop/Study/Java/IO/src/demoFile/obj.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        Student stu = new Student("Jeang", 20);
        oos.writeObject(stu);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
        Student stu1= (Student) ois.readObject();
        System.out.println(stu1.toString());
        ois.close();
    }
}
