package domain;

import java.util.ArrayList;

public class UserList {
    public static void init(ArrayList<User> list) {
        list.add(new User("admin", "123456"));
        list.add(new User("jia", "jia1"));
    }

    public static void showList(ArrayList<User> list) {
        System.out.println("===============================");
        for (User user : list) {
            System.out.println(user.getName() + " " + user.getPwd() + " 状态:" + user.getStatus());
        }
        System.out.println("===============================");
    }

}
