package com.jeang.study.practice1;

public class Test {
    /*
        1. 定义狗类
        属性：年龄，颜色
        行为：`eat(String something)`（something 表示吃的东西）
        看家`lookHome`方法 (无参数)
        2. 定义猫类
        属性：年龄，颜色
        行为：`eat(String something)`方法 (something 表示吃的东西)
        逮老鼠`catchMouse`方法 (无参数)
        3. 定义 Person 饲养员类
        属性：姓名，年龄
        行为：饲养动物`keepPet(Dog dog,String something)`方法
        要求：
        1. Person 的饲养动物的方法需要两个参数
        第一个参数：表示饲养的动物，既能饲养猫又能饲养狗。第二个参数：是给动物喂的食物
        2. 在 Person 的 keepPet 方法中调用子类的特有功能
     */
    public static void main(String[] args) {
        Person person=new Person("Jeang", 20);
        Dog dog=new Dog(2, "white");
        person.keepPet(dog, "bone");
        System.out.println(dog.getColor()+" "+dog.getAge());
        System.out.println("------------");
        Cat cat =new Cat();
        person.keepPet(cat, "mouse");
    }

}
