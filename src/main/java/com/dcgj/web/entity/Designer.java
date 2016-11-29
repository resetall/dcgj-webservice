package com.dcgj.web.entity;

public class Designer {
    private Integer id;

    private Integer designerId;

    private String designerName;

    private String instruction;

    private String designerAvatar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDesignerId() {
        return designerId;
    }

    public void setDesignerId(Integer designerId) {
        this.designerId = designerId;
    }

    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName == null ? null : designerName.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public String getDesignerAvatar() {
        return designerAvatar;
    }

    public void setDesignerAvatar(String designerAvatar) {
        this.designerAvatar = designerAvatar == null ? null : designerAvatar.trim();
    }
}