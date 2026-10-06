package domain;

public class Character {
    private String name;
    private int hp;
    private int maxHp;
    private int ak;
    private int df;

    public Character() {
    }

    public Character(String name, int hp, int maxHp, int ak, int df) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.ak = ak;
        this.df = df;
    }

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
