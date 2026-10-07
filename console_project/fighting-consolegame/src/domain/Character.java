package domain;

// 人物父类
public class Character {
    private String name;
    private int hp;
    private int maxHp;
    private int ak;
    private int df;

    public Character() {
    }

    public Character(String name, int hp, int ak, int df) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.ak = ak;
        this.df = df;
    }

    //    判断是否存活
    public boolean isAlive() {
        return hp > 0;
    }

    //    受到伤害
    public void takeDamage(int a) {
        hp -= a;
        if (hp < 0) hp = 0;
    }

    //    恢复血量
    public void heal(int h) {
        hp += h;
        hp = hp > maxHp ? maxHp : hp;
    }

    // 展示人物状态
    public void show(String name, int ak, int df) {
        System.out.println("[当前生命" + hp + ", 伤害" + ak + ", 防御" + df + "]");
    }

    //    get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAk() {
        return ak;
    }

    public void setAk(int ak) {
        this.ak = ak;
    }

    public int getDf() {
        return df;
    }

    public void setDf(int df) {
        this.df = df;
    }
}
