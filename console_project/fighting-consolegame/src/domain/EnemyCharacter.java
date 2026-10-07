package domain;

import java.util.ArrayList;

// 我方游戏角色
public class EnemyCharacter extends Character {

    ArrayList<String> skills = new ArrayList<>();

    public EnemyCharacter(ArrayList<String> skills) {
        this.skills = skills;
    }

    public EnemyCharacter(String name, int hp, int ak, int df, ArrayList<String> skills) {
        super(name, hp, ak, df);
        this.skills = skills;
    }


    //get/set

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
