package com.jeang.study.a04_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest4 {
    public static void main(String[] args) {
     /*
        Collect(Collector collector)  收集流中的数据到一个List中

        收集到Map中时键不能重复
     */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,
                "张无忌-男-15", "周芷若-女-14",
                "赵敏-女-13", "张强-男-26",
                "张三丰-男-100", "张翠山-男-40",
                "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        //收集List集合当中
        //需求：
        //我要把所有的男性收集起来
        List<String> newlist = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toList());
        //收集Set集合当中
        Set<String> newlist2 = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toSet());
        //收集Map集合当中
        Map<String, Integer> map = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        map.forEach((k, y) -> {
            System.out.println(k + " : " + y);
        });
    }
}
