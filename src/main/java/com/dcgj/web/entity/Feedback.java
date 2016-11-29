package com.dcgj.web.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 上午2:20
 * Desc:
 */
public class Feedback {
    private Integer id;

    private String feedbackContent;

    private String telephone;

    private Date feedbackDate;

    private Integer issolve;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public Integer getIssolve() {
        return issolve;
    }

    public void setIssolve(Integer issolve) {
        this.issolve = issolve;
    }
}