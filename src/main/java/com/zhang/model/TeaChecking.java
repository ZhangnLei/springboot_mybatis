package com.zhang.model;

import java.util.Date;

public class TeaChecking extends TeaCheckingKey {
    private String checking;

    private Date checkingTime;

    private Integer checkingIsPass;

    private String checkingReason;

    public String getChecking() {
        return checking;
    }

    public void setChecking(String checking) {
        this.checking = checking == null ? null : checking.trim();
    }

    public Date getCheckingTime() {
        return checkingTime;
    }

    public void setCheckingTime(Date checkingTime) {
        this.checkingTime = checkingTime;
    }

    public Integer getCheckingIsPass() {
        return checkingIsPass;
    }

    public void setCheckingIsPass(Integer checkingIsPass) {
        this.checkingIsPass = checkingIsPass;
    }

    public String getCheckingReason() {
        return checkingReason;
    }

    public void setCheckingReason(String checkingReason) {
        this.checkingReason = checkingReason == null ? null : checkingReason.trim();
    }
}