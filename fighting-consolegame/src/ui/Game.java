package ui;

import bean.Foe;
import bean.Role;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void start(String name) {
        Role role = new Role();
        ArrayList<Foe> foelist = new ArrayList<>();
        foelist.add(new Foe("初级战士", 80, 15, 10));
        foelist.add(new Foe("敏捷刺客", 60, 20, 5));
        foelist.add(new Foe("重装坦克", 120, 10, 20));
        foelist.add(new Foe("神秘法师", 70, 25, 8));

        createRole(role, name);

    }

    public static void createRole(Role role, String name) {
        Scanner sc = new Scanner(System.in);
        int mul = role.getMul();
        System.out.println("╔════════════════════════════════╗");
        System.out.println(" 🎮" + name + "欢迎来到文字格斗游戏  🎮 ");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("创建你的角色：");
        System.out.println("你的角色名称为：" + name);
        System.out.println("请分配属性点 (共" + mul + "点):");
        System.out.println(
                "1. 生命值 (每点+10 HP)\n" +
                        "2. 攻击力 (每点+2 ATK)\n" +
                        "3. 防御力 (每点+1 DEF)");
        int h = 0, a = 0, d = 0;
        while (true) {
            System.out.print("分配点数到 生命值 (剩余点数: " + mul + "):");
            h = sc.nextInt();
            if (h > mul) {
                System.out.println("输入有误！");
            } else {
                mul -= h;
                break;
            }
        }
        while (true) {
            System.out.print("分配点数到 攻击力 (剩余点数: " + mul + "):");
            h = sc.nextInt();
            if (h > mul) {
                System.out.println("输入有误！");
            } else {
                mul -= a;
                break;
            }
        }
        while (true) {
            System.out.print("分配点数到 防御力 (剩余点数: " + mul + "):");
            d = sc.nextInt();
            if (d > mul) {
                System.out.println("输入有误！");
            } else {
                mul -= d;
                break;
            }
        }
        role.setHp(h);
        role.setAk(a);
        role.setDp(d);
        System.out.println("角色创建成功！");
        System.out.println("\uD83C\uDF1F 初始属性: " + name + " [HP: " + role.getHp() + "/" + role.getHp() + ", ATK: " + role.getAk() + ", DEF: " + role.getDp() + "]");

    }
}
