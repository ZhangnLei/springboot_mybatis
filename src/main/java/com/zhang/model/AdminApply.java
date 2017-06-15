package com.zhang.model;

import java.util.Date;

public class AdminApply {
    private String applyId;

    private String adminId;

    private String annId;

    private Date applyTime;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getAnnId() {
        return annId;
    }

    public void setAnnId(String annId) {
        this.annId = annId == null ? null : annId.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}