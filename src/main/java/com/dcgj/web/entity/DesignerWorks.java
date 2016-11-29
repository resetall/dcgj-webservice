package com.dcgj.web.entity;

public class DesignerWorks {
    private Integer id;

    private Integer worksId;

    private String worksDesc;

    private String worksThumbnail;

    private Integer designerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public String getWorksDesc() {
        return worksDesc;
    }

    public void setWorksDesc(String worksDesc) {
        this.worksDesc = worksDesc == null ? null : worksDesc.trim();
    }

    public String getWorksThumbnail() {
        return worksThumbnail;
    }

    public void setWorksThumbnail(String worksThumbnail) {
        this.worksThumbnail = worksThumbnail == null ? null : worksThumbnail.trim();
    }

    public Integer getDesignerId() {
        return designerId;
    }

    public void setDesignerId(Integer designerId) {
        this.designerId = designerId;
    }
}