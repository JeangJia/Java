package com.jeang.study.Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("iphone", 8000));
        list.add(new Phone("huawei", 2000));
        list.add(new Phone("xiaomi", 3000));
        showlist(list,3000);
    }
    public static void showlist(ArrayList<Phone> list,int top){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<=top){
                System.out.println(list.get(i).getBrand()+" "+list.get(i).getPrice());
            }
        }
    }
}
