package ui;

import domain.User;
import domain.UserList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random r = new Random();

    public static void start() {
        ArrayList<User> userlist = new ArrayList<>();
        UserList.init(userlist);
        while (true) {
            System.out.println("╔════════════════════════════════╗");
            System.out.println("    🎮 欢迎来到文字格斗游戏 🎮   ");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("请选择操作：1登录 2注册 3退出");
            switch (readInt()) {
                case 0 -> UserList.showList(userlist);
                case 1 -> login(userlist);
                case 2 -> register(userlist);
                case 3 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新选择！");
            }
        }
    }

    /**
     * 安全读取一个整数，输入非数字时提示重输而不是崩溃
     */
    public static int readInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("请输入数字！");
            sc.next(); // 丢弃非法输入
        }
    }

    /**
     * 按用户名查找用户，找不到返回 null
     */
    public static User findUser(ArrayList<User> list, String name) {
        for (User u : list) {
            if (u.getName().equals(name)) {
                return u;
            }
        }
        return null;
    }

    public static void login(ArrayList<User> list) {
        User user;
        while (true) {
            System.out.print("输入用户名（输入0返回菜单）：");
            String name = sc.next();
            if (name.equals("0")) {
                System.out.println("已取消登录！");
                return; // 退回主菜单重新选择
            }
            user = findUser(list, name);
            if (user == null) {
                System.out.println("该用户不存在！");
                continue;
            }
            if (!user.getStatus()) {
                System.out.println(name + "已被冻结！");
                continue;
            }
            break;
        }

        boolean success = false;
        for (int chance = 3; chance > 0; chance--) {
            System.out.print("输入密码（输入0返回菜单）：");
            String pwd = sc.next();
            if (pwd.equals("0")) {
                System.out.println("已取消登录！");
                return; // 退回主菜单重新选择
            }
            if (pwd.equals(user.getPwd())) {
                success = true;
                break;
            }
            if (chance > 1) {
                System.out.println("密码错误！你还有" + (chance - 1) + "次登录机会！");
            }
        }

        if (!success) {
            user.setStatus(false);
            System.out.println(user.getName() + "已冻结");
            return; // 退回主菜单重新选择
        }

        // 验证码放在密码验证之后，登录成功前只需输一次
        while (true) {
            String yzm = getYzm();
            System.out.println("验证码：" + yzm);
            System.out.print("输入验证码：");
            if (sc.next().equalsIgnoreCase(yzm)) {
                break;
            }
            System.out.println("验证码错误！");
        }

        System.out.println("登录成功！");
//        Game.start(user.getName());
    }

    public static void register(ArrayList<User> list) {
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
            if (pwds.equals(pwd)) {
                list.add(new User(name, pwd));
                System.out.println("注册成功！");
                return;
            }
            System.out.println("两次密码不一致，请重新输入！");
        }
    }

    public static boolean checkName(ArrayList<User> list, String name) {
        if (name.length() < 3 || name.length() > 16) {
            System.out.println("长度必须在3 ~ 16位!");
            return false;
        }
        int letter = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                letter++;
            } else if (c < '0' || c > '9') {
                System.out.println("只能由字母、数字组成!");
                return false;
            }
        }
        if (letter == 0) {
            System.out.println("用户名不能是纯数字!");
            return false;
        }
        User u = findUser(list, name);
        if (u != null) {
            System.out.println(u.getStatus() ? "该用户已存在！" : "该用户已被冻结，无法注册！");
            return false;
        }
        return true;
    }

    public static boolean checkPwd(String pwd) {
        if (pwd.length() < 3 || pwd.length() > 8) {
            System.out.println("长度3 ~ 8位");
            return false;
        }
        int letter = 0, digit = 0;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (c >= '0' && c <= '9') {
                digit++;
            } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                letter++;
            } else {
                System.out.println("只能是字母加数字的组合，不能有其他字符");
                return false;
            }
        }
        if (letter == 0 || digit == 0) {
            System.out.println("密码必须同时包含字母和数字!");
            return false;
        }
        return true;
    }

    public static String getYzm() {
        String chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
