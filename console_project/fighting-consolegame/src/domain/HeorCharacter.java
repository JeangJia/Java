package domain;

import java.util.ArrayList;

// 敌方人物
public class HeorCharacter extends Character {

    private String skills;
    private boolean dfBuff;

    public HeorCharacter() {
    }

    public HeorCharacter(String name, int hp, int ak, int df, String skills, boolean dfBuff) {
        super(name, hp, ak, df);
        this.skills = skills;
        this.dfBuff = dfBuff;
    }

//    如果有dfBuff 重写takeDamage
    @Override
    public void takeDamage(int a) {
        if (dfBuff) {
            a = a / 2 > 1 ? a / 2 : 1;
        }
        super.takeDamage(a);
    }


    //get/set

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public boolean isDfBuff() {
        return dfBuff;
    }

    public void setDfBuff(boolean dfBuff) {
        this.dfBuff = dfBuff;
    }
}
