package com.jeang.study.Lambda;

public class test {
    public static void main(String[] args) {
        methon(new Swim() {
            @Override
            public void swimming() {
                System.out.println("weimming");
            }
        });
//        Lambda表达式
//        可以用来简化匿名内部类的书写
//        只能简化函数式接口(有且只有一个抽象方法的接口)的匿名内部类的写法
        methon(() -> {
            System.out.println("weimming");
        });
    }

    public static void methon(Swim s) {
        s.swimming();
    }

//    函数式接口注解
    @FunctionalInterface
    interface Swim {
        void swimming();
    }
}
