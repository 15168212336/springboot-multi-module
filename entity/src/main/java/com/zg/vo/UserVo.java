package com.zg.vo;

public class UserVo {

    private int id;
    private String username;
    private String passworod;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassworod() {
        return passworod;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassworod(String passworod) {
        this.passworod = passworod;
    }

    public UserVo(String username, String passworod) {
        this.username = username;
        this.passworod = passworod;
    }
}
