package ui;

import bean.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userlist = new ArrayList<>();
        while (true) {
            System.out.println("╔════════════════════════════════╗");
            System.out.println("    🎮 欢迎来到文字格斗游戏 🎮   ");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("请选择操作：1登录 2注册 3退出");
            int inp = sc.nextInt();
            switch (inp) {
                case 1 -> login(userlist);
                case 2 -> register(userlist);
                case 0 -> showList(userlist);
                default -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }
        }

    }

    public static void showList(ArrayList<User> list) {
        System.out.println("----------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ":" + list.get(i).getPwd() + " 状态：" + list.get(i).getStatus());
        }
        System.out.println("----------------------");
    }

    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String name = "", pwd = "";
        while (true) {
            System.out.print("输入用户名：");
            name = sc.next();
            if (checkName_l(list, name)) break;
        }
        int f = 3;
        while (f > 0) {
            System.out.print("输入密码：");
            pwd = sc.next();
            if (checkPwd_l(list, name, pwd, f)) break;
            f--;
        }
        if (f == 0) {
            frozenUser(list, name);
            System.out.println(name + "已冻结");
        } else {
            System.out.println("登录成功！");
        }


    }

    public static boolean checkName_l(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getStatus()) {
                System.out.println(name + "已被冻结！");
                return false;
            }
        }
        boolean f = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                f = true;
            }
        }
        if (!f) {
            System.out.println("该用户不存在！");
            return false;
        }
        return true;
    }

    public static boolean checkPwd_l(ArrayList<User> list, String name, String pwd, int f) {
        String PWD = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                PWD = list.get(i).getPwd();
                break;
            }
        }
        if (PWD.equals(pwd)) {
            return true;
        } else {
            System.out.println("你还有" + (f - 1) + "次登录机会！");
        }
        return false;
    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String name, pwd;
        while (true) {
            System.out.print("输入用户名：");
            name = sc.next();
            if (checkName(list, name)) break;
        }
        while (true) {
            System.out.print("输入密码：");
            pwd = sc.next();
            if (checkPwd(pwd)) break;
        }
        while (true) {
            System.out.print("再次输入密码：");
            String pwds = sc.next();
            if (pwds.equals(pwd)) break;
        }
        list.add(new User(name, pwd));
        System.out.println("注册成功！");

    }

    public static boolean checkName(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getStatus()) {
                System.out.println(name + "已被冻结！");
                return false;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println("该用户已存在！");
                return false;
            }
        }
        if (name.length() < 3 || name.length() > 16) {
            System.out.println("长度必须在3 ~ 16位!");
            return false;
        }
        int l = 0;
        for (int j = 0; j < name.length(); j++) {
            char c = name.charAt(j);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') l++;
            if (l > 0) return true;
        }
        System.out.println("只能由字母、数字组成，不能是纯数字!");
        return false;
    }

    public static boolean checkPwd(String pwd) {
        int len = pwd.length();
        if (len < 3 || len > 8) {
            System.out.println("长度3 ~ 8位");
            return false;
        }
        int l = 0, d = 0;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (c >= '1' && c <= '9') d++;
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') l++;
        }
        if (l + d == len && l > 0 && d > 0) return true;
        else {
            System.out.println("只能是字母加数字的组合，不能有其他字符");
        }
        return false;
    }

    public static void frozenUser(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.get(i).setStatus(false);
            }
        }
    }

    public static String getYzm() {
        Random r = new Random();
        String l = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String d = "1234567890";
        String tem = "";
        for (int i = 0; i < 6; i++) {
            tem += l.charAt(r.nextInt(l.length()));
        }
        int ind = r.nextInt(tem.length());
        String ret = "";
        for (int i = 0; i < tem.length(); i++) {
            if (ind == i) {
                ret += d.charAt(r.nextInt(d.length()));
            } else ret += tem.charAt(i);
        }
        return ret;
    }
}
