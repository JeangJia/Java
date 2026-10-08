package com.jeang.study.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        /*
            现在有两个 ArrayList 集合，
            第一个集合中：存储 6 名男演员的名字和年龄。第二个集合中：存储 6 名女演员的名字和年龄。
            姓名和年龄中间用逗号隔开。比如：张三，23
            要求完成如下的操作：
            1，男演员只要名字为 3 个字的前两人
            2，女演员只要姓杨的，并且不要第一个
            3，把过滤后的男演员姓名和女演员姓名合并到一起
            4，将上一步的演员信息封装成 Actor 对象。
            5，将所有的演员对象都保存到 List 集合中。
            备注：演员类 Actor，属性有：name，age
        */
        ArrayList<String> manList = new ArrayList<>();
        Collections.addAll(manList, "蔡坤,22", "吴彦祖,24", "周杰伦,26", "彭于晏,25", "张无忌,23", "刘德华,27");

        ArrayList<String> womanList = new ArrayList<>();
        Collections.addAll(womanList, "杨颖,21", "杨幂,22", "杨千嬅,23", "刘诗诗,24", "古力娜扎,25", "迪丽热巴,26");

        List<String> list = Stream.concat(
                manList.stream()
                        .filter(s -> s.split(",")[0].length() == 3)
                        .limit(2),
                womanList.stream()
                        .filter(s -> s.startsWith("杨"))
                        .skip(1)
        ).collect(Collectors.toList());
//        list.forEach(s -> System.out.println(s));
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(
                s -> s.split(",")[0],
                s -> Integer.parseInt(s.split(",")[1])
        ));
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
