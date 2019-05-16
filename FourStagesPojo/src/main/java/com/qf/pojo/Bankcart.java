package com.qf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Bankcart implements Serializable {
    private Integer bcid;

    private Integer userid;

    private String bccode;

    private String bcname;

    private String bcprovince;

    private String bccity;

    private String bcbranch;

    private String bcchongzhimoney;

    private Date bcchongtime;

    private Double bcmoney;

    private String bcflag;

    private String bcflag2;

    private static final long serialVersionUID = 1L;

    public Integer getBcid() {
        return bcid;
    }

    public void setBcid(Integer bcid) {
        this.bcid = bcid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBccode() {
        return bccode;
    }

    public void setBccode(String bccode) {
        this.bccode = bccode == null ? null : bccode.trim();
    }

    public String getBcname() {
        return bcname;
    }

    public void setBcname(String bcname) {
        this.bcname = bcname == null ? null : bcname.trim();
    }

    public String getBcprovince() {
        return bcprovince;
    }

    public void setBcprovince(String bcprovince) {
        this.bcprovince = bcprovince == null ? null : bcprovince.trim();
    }

    public String getBccity() {
        return bccity;
    }

    public void setBccity(String bccity) {
        this.bccity = bccity == null ? null : bccity.trim();
    }

    public String getBcbranch() {
        return bcbranch;
    }

    public void setBcbranch(String bcbranch) {
        this.bcbranch = bcbranch == null ? null : bcbranch.trim();
    }

    public String getBcchongzhimoney() {
        return bcchongzhimoney;
    }

    public void setBcchongzhimoney(String bcchongzhimoney) {
        this.bcchongzhimoney = bcchongzhimoney == null ? null : bcchongzhimoney.trim();
    }

    public Date getBcchongtime() {
        return bcchongtime;
    }

    public void setBcchongtime(Date bcchongtime) {
        this.bcchongtime = bcchongtime;
    }

    public Double getBcmoney() {
        return bcmoney;
    }

    public void setBcmoney(Double bcmoney) {
        this.bcmoney = bcmoney;
    }

    public String getBcflag() {
        return bcflag;
    }

    public void setBcflag(String bcflag) {
        this.bcflag = bcflag == null ? null : bcflag.trim();
    }

    public String getBcflag2() {
        return bcflag2;
    }

    public void setBcflag2(String bcflag2) {
        this.bcflag2 = bcflag2 == null ? null : bcflag2.trim();
    }

    @Override
    public String toString() {
        return "Bankcart{" +
                "bcid=" + bcid +
                ", userid=" + userid +
                ", bccode='" + bccode + '\'' +
                ", bcname='" + bcname + '\'' +
                ", bcprovince='" + bcprovince + '\'' +
                ", bccity='" + bccity + '\'' +
                ", bcbranch='" + bcbranch + '\'' +
                ", bcchongzhimoney='" + bcchongzhimoney + '\'' +
                ", bcchongtime=" + bcchongtime +
                ", bcmoney=" + bcmoney +
                ", bcflag='" + bcflag + '\'' +
                ", bcflag2='" + bcflag2 + '\'' +
                '}';
    }
}