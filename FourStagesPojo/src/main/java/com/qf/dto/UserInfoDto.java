package com.qf.dto;

import java.io.Serializable;

public class UserInfoDto implements Serializable {
    private Integer userid;

    private String username;

    private String usertel;

    private String userrname;

    private String useridentify;

    private String bccode;

    private String bcbranch;

    private String bcname;

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
        this.username = username;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUserrname() {
        return userrname;
    }

    public void setUserrname(String userrname) {
        this.userrname = userrname;
    }

    public String getUseridentify() {
        return useridentify;
    }

    public void setUseridentify(String useridentify) {
        this.useridentify = useridentify;
    }

    public String getBccode() {
        return bccode;
    }

    public void setBccode(String bccode) {
        this.bccode = bccode;
    }

    public String getBcbranch() {
        return bcbranch;
    }

    public void setBcbranch(String bcbranch) {
        this.bcbranch = bcbranch;
    }

    public String getBcname() {
        return bcname;
    }

    public void setBcname(String bcname) {
        this.bcname = bcname;
    }
}
