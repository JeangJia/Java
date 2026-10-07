package domain;

import java.util.ArrayList;

// 我方游戏角色
public class HeorCharacter extends Character {

    ArrayList<String> skills = new ArrayList<>();


    public HeorCharacter(ArrayList<String> skills) {
        this.skills = skills;
    }

    public HeorCharacter(String name, int hp, int ak, int df, ArrayList<String> skills) {
        super(name, hp, ak, df);
        this.skills = skills;
    }

    //重写toString
    @Override
    public String toString() {
        return this.getName() + " hp:" + this.getHp() + " ak:" + this.getAk() + " df:" + this.getDf();
    }


    //get/set

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
