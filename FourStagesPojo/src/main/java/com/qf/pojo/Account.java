package com.qf.pojo;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer accountid;

    private Integer userid;

    private Double accounttotalmoney;

    private Double accountusermoney;

    private Double accountfrostmoney;

    private Double accountyishoulixi;

    private Double accountdaishouzonge;

    private Double accountdaihuanjine;

    private Double accountflag;

    private Double accountflag2;

    private Double accountflag3;

    private static final long serialVersionUID = 1L;

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getAccounttotalmoney() {
        return accounttotalmoney;
    }

    public void setAccounttotalmoney(Double accounttotalmoney) {
        this.accounttotalmoney = accounttotalmoney;
    }

    public Double getAccountusermoney() {
        return accountusermoney;
    }

    public void setAccountusermoney(Double accountusermoney) {
        this.accountusermoney = accountusermoney;
    }

    public Double getAccountfrostmoney() {
        return accountfrostmoney;
    }

    public void setAccountfrostmoney(Double accountfrostmoney) {
        this.accountfrostmoney = accountfrostmoney;
    }

    public Double getAccountyishoulixi() {
        return accountyishoulixi;
    }

    public void setAccountyishoulixi(Double accountyishoulixi) {
        this.accountyishoulixi = accountyishoulixi;
    }

    public Double getAccountdaishouzonge() {
        return accountdaishouzonge;
    }

    public void setAccountdaishouzonge(Double accountdaishouzonge) {
        this.accountdaishouzonge = accountdaishouzonge;
    }

    public Double getAccountdaihuanjine() {
        return accountdaihuanjine;
    }

    public void setAccountdaihuanjine(Double accountdaihuanjine) {
        this.accountdaihuanjine = accountdaihuanjine;
    }

    public Double getAccountflag() {
        return accountflag;
    }

    public void setAccountflag(Double accountflag) {
        this.accountflag = accountflag;
    }

    public Double getAccountflag2() {
        return accountflag2;
    }

    public void setAccountflag2(Double accountflag2) {
        this.accountflag2 = accountflag2;
    }

    public Double getAccountflag3() {
        return accountflag3;
    }

    public void setAccountflag3(Double accountflag3) {
        this.accountflag3 = accountflag3;
    }
}