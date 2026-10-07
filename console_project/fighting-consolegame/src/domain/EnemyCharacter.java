package domain;

// 敌方人物
public class EnemyCharacter extends Character {

    private String skills;
    private boolean dfBuff;

    public EnemyCharacter() {
    }

    public EnemyCharacter(String name, int hp, int ak, int df, String skills) {
        super(name, hp, ak, df);
        this.skills = skills;
    }

    //    如果有dfBuff 重写takeDamage
    @Override
    public int takeDamage(int a) {
        if (dfBuff) {
            a = a / 2 > 1 ? a / 2 : 1;
        }
        int actual = super.takeDamage(a);
        dfBuff = false;
        return actual;
    }


    //get/set

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public boolean getDfBuff() {
        return dfBuff;
    }

    public void setDfBuff(boolean dfBuff) {
        this.dfBuff = dfBuff;
    }
}
