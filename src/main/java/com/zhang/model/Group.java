package com.zhang.model;

public class Group {
    private String groupId;

    private String groupName;

    private String groupStuNum;

    private String leaderId;

    private String topicId;

    private String groupTeaId;

    private String teaApplyId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupStuNum() {
        return groupStuNum;
    }

    public void setGroupStuNum(String groupStuNum) {
        this.groupStuNum = groupStuNum == null ? null : groupStuNum.trim();
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getGroupTeaId() {
        return groupTeaId;
    }

    public void setGroupTeaId(String groupTeaId) {
        this.groupTeaId = groupTeaId == null ? null : groupTeaId.trim();
    }

    public String getTeaApplyId() {
        return teaApplyId;
    }

    public void setTeaApplyId(String teaApplyId) {
        this.teaApplyId = teaApplyId == null ? null : teaApplyId.trim();
    }
}