package com.zhang.model;

public class GroupTopic {
    private String groupTopicId;

    private String groupId;

    private String topicId;

    private String groupTopicTime;

    public String getGroupTopicId() {
        return groupTopicId;
    }

    public void setGroupTopicId(String groupTopicId) {
        this.groupTopicId = groupTopicId == null ? null : groupTopicId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getGroupTopicTime() {
        return groupTopicTime;
    }

    public void setGroupTopicTime(String groupTopicTime) {
        this.groupTopicTime = groupTopicTime == null ? null : groupTopicTime.trim();
    }
}