package com.qf.pojo;

import java.io.Serializable;

public class Topup implements Serializable {
    private Integer topupid;

    private Integer userid;

    private String topupnumber;

    private String topupleixing;

    private String topupfangshi;

    private String topupbeizhu;

    private String topupzhuangtai;

    private static final long serialVersionUID = 1L;

    public Integer getTopupid() {
        return topupid;
    }

    public void setTopupid(Integer topupid) {
        this.topupid = topupid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTopupnumber() {
        return topupnumber;
    }

    public void setTopupnumber(String topupnumber) {
        this.topupnumber = topupnumber == null ? null : topupnumber.trim();
    }

    public String getTopupleixing() {
        return topupleixing;
    }

    public void setTopupleixing(String topupleixing) {
        this.topupleixing = topupleixing == null ? null : topupleixing.trim();
    }

    public String getTopupfangshi() {
        return topupfangshi;
    }

    public void setTopupfangshi(String topupfangshi) {
        this.topupfangshi = topupfangshi == null ? null : topupfangshi.trim();
    }

    public String getTopupbeizhu() {
        return topupbeizhu;
    }

    public void setTopupbeizhu(String topupbeizhu) {
        this.topupbeizhu = topupbeizhu == null ? null : topupbeizhu.trim();
    }

    public String getTopupzhuangtai() {
        return topupzhuangtai;
    }

    public void setTopupzhuangtai(String topupzhuangtai) {
        this.topupzhuangtai = topupzhuangtai == null ? null : topupzhuangtai.trim();
    }
}