package com.jeang.study.ooptest8;

public class Test {
    /*
        第一代手机：
            功能：打电话
        第二代手机：
            功能：打电话，发短信
        第三代手机：
            功能：打电话升级为视频通话，发短信，玩游戏
    */
    public static void main(String[] args) {
        First first = new First();
        System.out.println("first:");
        first.call();
        Second second = new Second();
        System.out.println("second:");
        second.call();
        second.sendSMS();
        Third third = new Third();
        System.out.println("third:");
        third.call();
        third.sendSMS();

    }

    public static class First {
        public void call() {
            System.out.println("打电话");
        }
    }

    public static class Second extends First {
        public void sendSMS() {
            System.out.println("发短信");
        }
    }

    public static class Third extends Second {
//        重写父类的call方法
        @Override
        public void call() {
            System.out.println("视频通话");
        }
    }

}
