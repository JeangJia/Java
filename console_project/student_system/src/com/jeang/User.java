package com.jeang;

public class User {
    private String username;
    private String pwd;
    private String phone;

    public User() {
    }

    public User(String username, String pwd, String phone) {
        this.username = username;
        this.pwd = pwd;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
