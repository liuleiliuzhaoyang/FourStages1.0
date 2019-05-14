package com.qf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Claim implements Serializable {
    private Integer claimid;

    private Integer userid;

    private String claimzuidi;

    private String claimzuigao;

    private String claimzhuanrang;

    private String claimchengjie;

    private Date claimzhuangrangdate;

    private String claimzhuangtai;

    private static final long serialVersionUID = 1L;

    public Integer getClaimid() {
        return claimid;
    }

    public void setClaimid(Integer claimid) {
        this.claimid = claimid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getClaimzuidi() {
        return claimzuidi;
    }

    public void setClaimzuidi(String claimzuidi) {
        this.claimzuidi = claimzuidi == null ? null : claimzuidi.trim();
    }

    public String getClaimzuigao() {
        return claimzuigao;
    }

    public void setClaimzuigao(String claimzuigao) {
        this.claimzuigao = claimzuigao == null ? null : claimzuigao.trim();
    }

    public String getClaimzhuanrang() {
        return claimzhuanrang;
    }

    public void setClaimzhuanrang(String claimzhuanrang) {
        this.claimzhuanrang = claimzhuanrang == null ? null : claimzhuanrang.trim();
    }

    public String getClaimchengjie() {
        return claimchengjie;
    }

    public void setClaimchengjie(String claimchengjie) {
        this.claimchengjie = claimchengjie == null ? null : claimchengjie.trim();
    }

    public Date getClaimzhuangrangdate() {
        return claimzhuangrangdate;
    }

    public void setClaimzhuangrangdate(Date claimzhuangrangdate) {
        this.claimzhuangrangdate = claimzhuangrangdate;
    }

    public String getClaimzhuangtai() {
        return claimzhuangtai;
    }

    public void setClaimzhuangtai(String claimzhuangtai) {
        this.claimzhuangtai = claimzhuangtai == null ? null : claimzhuangtai.trim();
    }
}