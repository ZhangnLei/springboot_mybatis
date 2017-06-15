package com.zhang.model;

import java.util.Date;

public class ann_id {
    private String annId;

    private String annUrl;

    private String annTitle;

    private String annContent;

    private Date annStartTime;

    private Date annEndTime;

    private String teaId;

    private String topicId;

    public String getAnnId() {
        return annId;
    }

    public void setAnnId(String annId) {
        this.annId = annId == null ? null : annId.trim();
    }

    public String getAnnUrl() {
        return annUrl;
    }

    public void setAnnUrl(String annUrl) {
        this.annUrl = annUrl == null ? null : annUrl.trim();
    }

    public String getAnnTitle() {
        return annTitle;
    }

    public void setAnnTitle(String annTitle) {
        this.annTitle = annTitle == null ? null : annTitle.trim();
    }

    public String getAnnContent() {
        return annContent;
    }

    public void setAnnContent(String annContent) {
        this.annContent = annContent == null ? null : annContent.trim();
    }

    public Date getAnnStartTime() {
        return annStartTime;
    }

    public void setAnnStartTime(Date annStartTime) {
        this.annStartTime = annStartTime;
    }

    public Date getAnnEndTime() {
        return annEndTime;
    }

    public void setAnnEndTime(Date annEndTime) {
        this.annEndTime = annEndTime;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId == null ? null : teaId.trim();
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }
}