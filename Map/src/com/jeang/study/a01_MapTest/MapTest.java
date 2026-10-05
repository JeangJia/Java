package com.jeang.study.a01_MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    /*
        V put(K key,V value)          添加元素 如果存在相同的键返回原始值
        V remove(Object key)          根据键删除键值对元素
        void clear()                  移除所有的键值对元素
        boolean containsKey(Object key)    判断集合是否包含指定的键
        boolean containsValue(Object value) 判断集合是否包含指定的值
        boolean isEmpty()             判断集合是否为空
        int size()                    集合的长度，也就是集合中键值对的个数
    */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        System.out.println(map);
//        返回被替换的值
        System.out.println(map.put("1", "first"));

//      单列集合  键值对遍历
        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key + ":" + map.get(key));
//        }
//        迭代器遍历
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String k = it.next();
            System.out.println(k + " " + map.get(k));
        }

//        Lambda遍历
//        map.forEach((k, v) -> {
//            System.out.println(k + ":" + v);
//        });
    }
}
