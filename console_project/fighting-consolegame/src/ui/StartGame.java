package ui;

import domain.HeorCharacter;

import java.util.ArrayList;
import java.util.Scanner;

public class StartGame {

    public static void start(String name) {
        final int POINTS = 20;
        System.out.println("╔════════════════════════════════╗");
        System.out.println(" 🎮欢迎" + name + "来到文字格斗游戏🎮   ");
        System.out.println("╚════════════════════════════════╝");
        HeorCharacter role = createPlayCharacter(name, POINTS);
        System.out.println("角色创建成功!");
        show(role);
        StartFight.fight(role);
    }

    public static HeorCharacter createPlayCharacter(String name, int n) {
        System.out.println("创建你的角色:");
        System.out.println("您的角色名为:" + name);
        System.out.println(" 请分配属性点 (共" + n + "点):");
        System.out.println("1. 生命值 (每点+10 HP)");
        System.out.println("2. 攻击力 (每点+2 ATK)");
        System.out.println("3. 防御力 (每点+1 DEF)");
        String[] distribute = {"生命值", "攻击力", "防御力"};
        int[] val = new int[distribute.length];
        ArrayList<String> skills = new ArrayList<>();
        showDistribute(distribute, n, val);
        HeorCharacter ret = new HeorCharacter(
                name,
                100 + val[0] * 10,//初始血量100
                10 + val[1] * 2,//初始攻击力10
                0 + val[2] * 1,//初始防御力0
                skills
        );
        ret.getSkills().add("普通攻击");
        ret.getSkills().add("强力一击");
        ret.getSkills().add("生命吸取");
        return ret;
    }

    public static void showDistribute(String[] list, int n, int[] val) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            while (true) {
                System.out.print("分配点数到 " + list[i] + " (剩余点数: " + n + "): ");
                int d = sc.nextInt();
                if (d < 0 || d > n) {
                    System.out.println("输入有误!重新输入!");
                } else {
                    val[i] = d;
                    n -= d;
                    break;
                }
            }
        }

    }

    public static void show(HeorCharacter h) {
        System.out.println("属性: " + h.getName() + " [Hp:" + h.getHp() + ", " + "Ak:" + h.getAk() + ", " + "DF:" + h.getDf() + "]");
        System.out.print("拥有的技能: ");
        for (int i = 0; i < h.getSkills().size(); i++) {
            System.out.print(h.getSkills().get(i));
            if (i != h.getSkills().toArray().length - 1) System.out.print(", ");
        }
    }
}
