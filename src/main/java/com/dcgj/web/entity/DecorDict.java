package com.dcgj.web.entity;

public class DecorDict {
    private Integer id;

    private String dictSpace;

    private String dictLayout;

    private String dictStyle;

    private String dictColor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictSpace() {
        return dictSpace;
    }

    public void setDictSpace(String dictSpace) {
        this.dictSpace = dictSpace == null ? null : dictSpace.trim();
    }

    public String getDictLayout() {
        return dictLayout;
    }

    public void setDictLayout(String dictLayout) {
        this.dictLayout = dictLayout == null ? null : dictLayout.trim();
    }

    public String getDictStyle() {
        return dictStyle;
    }

    public void setDictStyle(String dictStyle) {
        this.dictStyle = dictStyle == null ? null : dictStyle.trim();
    }

    public String getDictColor() {
        return dictColor;
    }

    public void setDictColor(String dictColor) {
        this.dictColor = dictColor == null ? null : dictColor.trim();
    }
}