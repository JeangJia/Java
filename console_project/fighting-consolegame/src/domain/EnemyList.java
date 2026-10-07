package domain;

import java.util.ArrayList;

public class EnemyList {
    private EnemyList() {
    }

    public static ArrayList<EnemyCharacter> initEnemyList() {
        ArrayList<EnemyCharacter> list = new ArrayList<>();
        list.add(new EnemyCharacter("初级战士", 80, 15, 10, "猛击"));
        list.add(new EnemyCharacter("敏捷刺客", 60, 20, 5, "快速攻击"));
        list.add(new EnemyCharacter("重装坦克", 120, 10, 20, "防御姿态"));
        list.add(new EnemyCharacter("神秘法师", 70, 25, 8, "火球术"));
        return list;
    }

}
