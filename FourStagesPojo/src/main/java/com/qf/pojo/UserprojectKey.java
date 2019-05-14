package com.qf.pojo;

import java.io.Serializable;

public class UserprojectKey implements Serializable {
    private Integer userid;

    private Integer projectid;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }
}