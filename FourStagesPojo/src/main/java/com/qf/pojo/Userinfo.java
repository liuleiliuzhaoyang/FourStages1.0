package com.qf.pojo;

import java.io.Serializable;

public class Userinfo implements Serializable {
    private Integer userid;

    private String username;

    private String usertel;

    private String userpass;

    private String userrname;

    private String useridentify;

    private Integer userflag;

    private String userflag2;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public String getUserrname() {
        return userrname;
    }

    public void setUserrname(String userrname) {
        this.userrname = userrname == null ? null : userrname.trim();
    }

    public String getUseridentify() {
        return useridentify;
    }

    public void setUseridentify(String useridentify) {
        this.useridentify = useridentify == null ? null : useridentify.trim();
    }

    public Integer getUserflag() {
        return userflag;
    }

    public void setUserflag(Integer userflag) {
        this.userflag = userflag;
    }

    public String getUserflag2() {
        return userflag2;
    }

    public void setUserflag2(String userflag2) {
        this.userflag2 = userflag2 == null ? null : userflag2.trim();
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usertel='" + usertel + '\'' +
                ", userpass='" + userpass + '\'' +
                ", userrname='" + userrname + '\'' +
                ", useridentify='" + useridentify + '\'' +
                ", userflag=" + userflag +
                ", userflag2='" + userflag2 + '\'' +
                '}';
    }
}