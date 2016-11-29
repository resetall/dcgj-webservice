package com.dcgj.web.entity;

import java.util.Date;

public class VistorInfo {
    private Integer id;

    private String vistorname;

    private String telephone;

    private Date registDate;

    private Integer isreply;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVistorname() {
        return vistorname;
    }

    public void setVistorname(String vistorname) {
        this.vistorname = vistorname == null ? null : vistorname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Integer getIsreply() {
        return isreply;
    }

    public void setIsreply(Integer isreply) {
        this.isreply = isreply;
    }
}