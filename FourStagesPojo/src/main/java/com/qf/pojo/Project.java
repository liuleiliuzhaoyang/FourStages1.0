package com.qf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {
    private Integer projectid;

    private String projectname;

    private Double projectlilv;

    private String projectqixian;

    private String projectmoney;

    private String projectflag;

    private String projectflag2;

    private String projectbianhao;

    private String projiectdengji;

    private String projectleixing;

    private String projectjindu;

    private Date projectfaqishijain;

    private Date projectjieshushijain;

    private static final long serialVersionUID = 1L;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Double getProjectlilv() {
        return projectlilv;
    }

    public void setProjectlilv(Double projectlilv) {
        this.projectlilv = projectlilv;
    }

    public String getProjectqixian() {
        return projectqixian;
    }

    public void setProjectqixian(String projectqixian) {
        this.projectqixian = projectqixian == null ? null : projectqixian.trim();
    }

    public String getProjectmoney() {
        return projectmoney;
    }

    public void setProjectmoney(String projectmoney) {
        this.projectmoney = projectmoney == null ? null : projectmoney.trim();
    }

    public String getProjectflag() {
        return projectflag;
    }

    public void setProjectflag(String projectflag) {
        this.projectflag = projectflag == null ? null : projectflag.trim();
    }

    public String getProjectflag2() {
        return projectflag2;
    }

    public void setProjectflag2(String projectflag2) {
        this.projectflag2 = projectflag2 == null ? null : projectflag2.trim();
    }

    public String getProjectbianhao() {
        return projectbianhao;
    }

    public void setProjectbianhao(String projectbianhao) {
        this.projectbianhao = projectbianhao == null ? null : projectbianhao.trim();
    }

    public String getProjiectdengji() {
        return projiectdengji;
    }

    public void setProjiectdengji(String projiectdengji) {
        this.projiectdengji = projiectdengji == null ? null : projiectdengji.trim();
    }

    public String getProjectleixing() {
        return projectleixing;
    }

    public void setProjectleixing(String projectleixing) {
        this.projectleixing = projectleixing == null ? null : projectleixing.trim();
    }

    public String getProjectjindu() {
        return projectjindu;
    }

    public void setProjectjindu(String projectjindu) {
        this.projectjindu = projectjindu == null ? null : projectjindu.trim();
    }

    public Date getProjectfaqishijain() {
        return projectfaqishijain;
    }

    public void setProjectfaqishijain(Date projectfaqishijain) {
        this.projectfaqishijain = projectfaqishijain;
    }

    public Date getProjectjieshushijain() {
        return projectjieshushijain;
    }

    public void setProjectjieshushijain(Date projectjieshushijain) {
        this.projectjieshushijain = projectjieshushijain;
    }
}