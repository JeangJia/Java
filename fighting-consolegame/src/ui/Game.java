package ui;

import bean.Role;

import java.util.Scanner;

public class Game {
    public static void start(String name) {
        int mul = (new Role()).getMul();
        Role role = createRole(mul, name);
        while (true) {
            combat(role);
        }

    }

    public static Role createRole(int mul, String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("╔════════════════════════════════╗");
        System.out.println(" 🎮" + name + "欢迎来到文字格斗游戏  🎮 ");
        System.out.println("╚════════════════════════════════╝");
        System.out.println();
        System.out.println("创建你的角色：");
        System.out.println("你的角色名称为：" + name);
        System.out.println("请分配属性点 (共" + mul + "点):");
        Role tem = new Role();
        System.out.println(
                "1. 生命值 (每点+" + tem.getInithp_mul() + " HP)\n" +
                        "2. 攻击力 (每点+" + tem.getInitak_mul() + " ATK)\n" +
                        "3. 防御力 (每点+" + tem.getInitdp_mul() + " DEF)");
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
        Role ret = new Role(name, h, a, d);
        System.out.println("角色创建成功！");
        System.out.println("\uD83C\uDF1F 初始属性: " +
                name + " [HP: " + ret.getHp() + "/" +
                ret.getHp() + ", ATK: " + ret.getAk() +
                ", DEF: " + ret.getDp() + "]");
        return ret;

    }

    public static void combat(Role role) {

    }
}
