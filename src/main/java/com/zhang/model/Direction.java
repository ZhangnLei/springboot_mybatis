package com.zhang.model;

public class Direction {
    private String dirId;

    private String dirTitle;

    private Byte dirStuType;

    public String getDirId() {
        return dirId;
    }

    public void setDirId(String dirId) {
        this.dirId = dirId == null ? null : dirId.trim();
    }

    public String getDirTitle() {
        return dirTitle;
    }

    public void setDirTitle(String dirTitle) {
        this.dirTitle = dirTitle == null ? null : dirTitle.trim();
    }

    public Byte getDirStuType() {
        return dirStuType;
    }

    public void setDirStuType(Byte dirStuType) {
        this.dirStuType = dirStuType;
    }
}