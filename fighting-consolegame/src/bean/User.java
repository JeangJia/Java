package bean;

import java.util.Random;

public class User {
    private String id;
    private String name;
    private String pwd;
    private boolean status;

    String s = "jeang";

    //    构造函数
    public User() {
        id = createId();
        status = true;
    }

    public User(String name, String pwd) {
        id = createId();
        this.name = name;
        this.pwd = pwd;
        status = true;
    }

    public String createId() {
        StringBuffer ret = new StringBuffer(s);
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            ret.append(r.nextInt(10));
        }
        return ret.toString();
    }

    //  get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
