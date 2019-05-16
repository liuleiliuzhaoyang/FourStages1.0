package com.qf.pojo;

import java.io.Serializable;

public class Identify implements Serializable {
    private Integer identifyid;

    private String identifyname;

    private String identifycode;

    private String identifytel;

    private static final long serialVersionUID = 1L;

    public Integer getIdentifyid() {
        return identifyid;
    }

    public void setIdentifyid(Integer identifyid) {
        this.identifyid = identifyid;
    }

    public String getIdentifyname() {
        return identifyname;
    }

    public void setIdentifyname(String identifyname) {
        this.identifyname = identifyname == null ? null : identifyname.trim();
    }

    public String getIdentifycode() {
        return identifycode;
    }

    public void setIdentifycode(String identifycode) {
        this.identifycode = identifycode == null ? null : identifycode.trim();
    }

    public String getIdentifytel() {
        return identifytel;
    }

    public void setIdentifytel(String identifytel) {
        this.identifytel = identifytel == null ? null : identifytel.trim();
    }

    @Override
    public String toString() {
        return "Identify{" +
                "identifyid=" + identifyid +
                ", identifyname='" + identifyname + '\'' +
                ", identifycode='" + identifycode + '\'' +
                ", identifytel='" + identifytel + '\'' +
                '}';
    }
}