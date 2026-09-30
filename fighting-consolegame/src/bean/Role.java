package bean;

public class Role {
    private String name;
    private int hp;
    private int ak;
    private int dp;

    int inithp = 100;
    int initak = 10;
    int initdp = 0;

    int mul = 20;
    int inithp_mul = 10;
    int initak_mul = 2;
    int initdp_mul = 1;

    //    构造函数
    public Role() {
    }

    public Role(String name,int hp, int ak, int dp) {
        this.name = name;
        this.hp = hp * inithp_mul + inithp;
        this.ak = ak * initak_mul + initak;
        this.dp = dp * initdp_mul + initdp;
    }

    //    get/set
    public int getInithp_mul(){
        return inithp_mul;
    }
    public int getInitak_mul(){
        return initak_mul;
    }
    public int getInitdp_mul(){
        return initdp_mul;
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

    public int getMul() {
        return mul;
    }

    public void setMul(int mul) {
        this.mul = mul;
    }

}
