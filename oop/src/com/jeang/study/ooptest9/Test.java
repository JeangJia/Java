package com.jeang.study.ooptest9;

public class Test {
    /*
    书写一个完整的继承体系，要求私有化成员变量、get/set 方法、构造方法、其他的成员方法
    本科学生：
    属性：姓名、年龄、年级
    行为：吃饭、睡觉、学习（攻读学士学位）
    硕士研究生：
    属性：姓名、年龄、年级
    行为：吃饭、睡觉、学习（攻读硕士学位）
    专业课老师：
    属性：姓名、年龄、学科
    行为：吃饭、睡觉、教书（教专业课知识）
    通识课老师：
    属性：姓名、年龄
    行为：吃饭、睡觉、教书（教通识课知识）
    过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉
    */
    public static void main(String[] args) {
        Common_Student cs = new Common_Student("张三", 20, 1);
        System.out.println(cs.getName() + " " + cs.getAge() + " " + cs.getGrade());
        System.out.println("-----------------");
        Graduate_Student gs = new Graduate_Student("李四", 25, 2);
        System.out.println(gs.getName() + " " + gs.getAge() + " " + gs.getGrade());
        gs.study();
        gs.sleep();
        System.out.println("-----------------");
        Liberal_Teacher lt = new Liberal_Teacher("王五", 30);
        System.out.print(lt.getName() + " " + lt.getAge() + " ");
        lt.teach();
    }
}
