package com.qf.pojo;

public class Login {
    private String usertel;
    private String userpass;

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "Login{" +
                "usertel='" + usertel + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }
}
