package com.zhang.model;

public class Topic {
    private String topicId;

    private String topicTitle;

    private String topicContent;

    private String topUrl;

    private Integer topicStatus;

    private Integer topicCoefficient;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle == null ? null : topicTitle.trim();
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent == null ? null : topicContent.trim();
    }

    public String getTopUrl() {
        return topUrl;
    }

    public void setTopUrl(String topUrl) {
        this.topUrl = topUrl == null ? null : topUrl.trim();
    }

    public Integer getTopicStatus() {
        return topicStatus;
    }

    public void setTopicStatus(Integer topicStatus) {
        this.topicStatus = topicStatus;
    }

    public Integer getTopicCoefficient() {
        return topicCoefficient;
    }

    public void setTopicCoefficient(Integer topicCoefficient) {
        this.topicCoefficient = topicCoefficient;
    }
}