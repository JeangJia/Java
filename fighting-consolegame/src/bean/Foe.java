package bean;

public class Foe {
    private String name;
    private int hp;
    private int ak;
    private int dp;

    //    构造方法
    public Foe() {
    }

    public Foe(String name, int hp, int ak, int dp) {
        this.name = name;
        this.hp = hp;
        this.ak = ak;
        this.dp = dp;
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

    public int getAk() {
        return ak;
    }

    public void setAk(int ak) {
        this.ak = ak;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

}
