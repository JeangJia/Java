package ui;

import domain.EnemyCharacter;
import domain.EnemyList;
import domain.HeorCharacter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StartFight {
    public static void fight(HeorCharacter role) {

    /*
    胜利时：
        恢复20-40点生命值
        胜场数+1
        每3胜获得属性提升
    失败时：游戏结束

    属性
        每胜利三场，玩家属性增加HP+30, ATK+5, DEF+3
        玩家每连胜一场：怪物属性增加HP+10, ATK+3, DEF+2
        基础伤害公式：伤害 = 攻击力 - 防御力
        最小伤害：1点
        技能伤害：伤害 = 攻击力 * n% - 防御力
    */
        int round = 1;// 战斗场次
        int wins = 0;// 胜场数
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<EnemyCharacter> enemyList;
//        start
        while (role.isAlive()) {
            // 每场重新生成一份敌人,否则抽到的是上一场被打残的同一个对象
            enemyList = EnemyList.initEnemyList();
            EnemyCharacter enemy = enemyList.get(r.nextInt(enemyList.size()));
            System.out.println();
            System.out.println("⚔\uFE0F 第 " + round + " 场战斗开始！对手: " + enemy.getName());
//            属性设置
            int growHp = (round - 1) * 10;
            enemy.setHp(enemy.getHp() + growHp);
            enemy.setMaxHp(enemy.getMaxHp() + growHp);
            enemy.setAk(enemy.getAk() + (round - 1) * 3);
            enemy.setDf(enemy.getDf() + (round - 1) * 2);

            int cnt = 1;
            while (role.isAlive() && enemy.isAlive()) {
                System.out.println("⚔\uFE0F 第 " + (cnt++) + " 回合开始！ ");
                System.out.println(role.getName() + ": " + role.getHp() + "/" + role.getMaxHp() + " HP  DEF " + role.getDf());
                System.out.println(enemy.getName() + ": " + enemy.getHp() + "/" + enemy.getMaxHp() + " HP  DEF " + enemy.getDf()
                        + (enemy.getDfBuff() ? "  [防御姿态中]" : ""));
                System.out.println("=====你的回合=====");
                System.out.println("1. 普通攻击");
                System.out.println("2. 强力一击 (消耗10Hp)");
                System.out.println("3. 生命吸取 (消耗10HP, 恢复生命)");
                System.out.print("选择行动(1~3): ");
                while (true) {
                    int f = 1;
                    int i = sc.nextInt();
                    switch (i) {
                        case 1 -> {
                            int d = enemy.takeDamage(role.getAk());
                            System.out.println("你使用了普通攻击! 造成" + d + "伤害!");
                            f = 1;
                        }
                        case 2 -> {
                            if (role.getHp() < 10) {
                                System.out.println("🔪血量低于10 使用失败!");
                                f = 0;
                            } else {
                                int a = role.getAk() * 180 / 100;
                                int d = enemy.takeDamage(a);
                                System.out.println("💥消耗10HP 使用了强力一击! 造成了" + d + "伤害!");
                                role.setHp(role.getHp() - 10);
                                f = 1;
                            }
                        }
                        case 3 -> {
                            if (role.getHp() < 10) {
                                System.out.println("❤‍🩹血量低于10 使用失败!");
                                f = 0;
                            } else {
                                int h = r.nextInt(20);
                                System.out.println("消耗10HP 恢复了" + h + "血量!");
                                role.heal(h);
                                f = 1;
                            }

                        }
                        default -> {
                            System.out.println("无效输入!");
                            f = 0;
                        }
                    }
                    if (f == 1) break;
                }
                System.out.println();
                //判断对方是否存活
                if (!enemy.isAlive()) {
                    System.out.println("👏恭喜你击败了 " + enemy.getName());
                    break;
                }
                // 对方回合
                System.out.println("=====" + enemy.getName() + "的回合=====");
                enemyRound(role, enemy);
                //我方是否存活
                if (!role.isAlive()) {
                    System.out.println("你被" + enemy.getName() + "打败了");
                    System.out.println("游戏结束!");
                }
            }
            round++;
            boolean f = false;
            while (true) {
                System.out.print("是否继续游戏(y/n):");
                String t = sc.next();
                if (t.equalsIgnoreCase("y")) {
                    // 战斗结束 属性提升
                    int h = r.nextInt(20, 41);
                    role.heal(h);
                    System.out.println("❤‍🩹恢复 " + h + " 血量");
                    wins++;
                    System.out.println("🏆当前胜场: " + wins);
                    if (wins != 0 && wins % 3 == 0) {
                        // 这里只加"这一次"的增量。乘 wins/3 会把之前加过的再算一遍
                        role.setHp(role.getHp() + 30);
                        role.setMaxHp(role.getMaxHp() + 30);
                        role.setAk(role.getAk() + 5);
                        role.setDf(role.getDf() + 3);
                    }
                    break;
                } else if (t.equalsIgnoreCase("n")) {
                    f = true;
                    break;
                } else {
                    System.out.println("无效输入!");
                }
            }
            if (f) {
                System.out.println("Bye!");
                break;
            }
        }
    }

    public static void enemyRound(HeorCharacter role, EnemyCharacter enemy) {
        Random r = new Random();
        int tem = r.nextInt(10);
        String way = "";
        int damage = 0;
        if (tem % 2 == 0)
            way = "普通攻击";
        else way = enemy.getSkills();
        switch (way) {
            case "普通攻击" -> {
                System.out.println(enemy.getName() + "使用了普通攻击");
                damage = receiveAk(role, enemy.getAk());
            }
            case "猛击" -> {
                System.out.println(enemy.getName() + "使用了 猛击!");
                damage = receiveAk(role, (int) (enemy.getAk() * 1.5));
            }
            case "快速攻击" -> {
                System.out.println(enemy.getName() + "使用了快速攻击!");
                for (int i = 0; i < 2; i++) {
                    damage += receiveAk(role, enemy.getAk()/2);
                }
            }
            case "防御姿态" -> {
                System.out.println(enemy.getName() + "使用了防御姿态");
                enemy.setDfBuff(true);
            }
            case "火球术" -> {
                System.out.println(enemy.getName() + "使用了火球术!");
                damage = receiveAk(role, (int) (enemy.getAk() * 1.8));
            }
        }
        if (damage > 0) {
            System.out.println("给你造成了 " + damage + " 的伤害!");
        }
        System.out.println();
    }

    public static int receiveAk(HeorCharacter role, int a) {
        return role.takeDamage(a);
    }
}
