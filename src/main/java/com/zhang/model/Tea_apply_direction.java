package com.zhang.model;

import java.util.Date;

public class Tea_apply_direction {
    private String teaApplyId;

    private String teaId;

    private Date teaApplyTime;

    private Byte teaApplyStatus;

    private String teaApplyDirTitle;

    private Byte teaApplyStuType;

    public String getTeaApplyId() {
        return teaApplyId;
    }

    public void setTeaApplyId(String teaApplyId) {
        this.teaApplyId = teaApplyId == null ? null : teaApplyId.trim();
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId == null ? null : teaId.trim();
    }

    public Date getTeaApplyTime() {
        return teaApplyTime;
    }

    public void setTeaApplyTime(Date teaApplyTime) {
        this.teaApplyTime = teaApplyTime;
    }

    public Byte getTeaApplyStatus() {
        return teaApplyStatus;
    }

    public void setTeaApplyStatus(Byte teaApplyStatus) {
        this.teaApplyStatus = teaApplyStatus;
    }

    public String getTeaApplyDirTitle() {
        return teaApplyDirTitle;
    }

    public void setTeaApplyDirTitle(String teaApplyDirTitle) {
        this.teaApplyDirTitle = teaApplyDirTitle == null ? null : teaApplyDirTitle.trim();
    }

    public Byte getTeaApplyStuType() {
        return teaApplyStuType;
    }

    public void setTeaApplyStuType(Byte teaApplyStuType) {
        this.teaApplyStuType = teaApplyStuType;
    }
}