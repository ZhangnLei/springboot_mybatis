package com.zhang.model;

public class Student {
    private String stuId;

    private String stuName;

    private String stuClass;

    private String stuDuty;

    private String stuLastIp;

    private String stuDepartment;

    private String stuMajor;

    private Integer stuLevel;

    private String stuGroupId;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }

    public String getStuDuty() {
        return stuDuty;
    }

    public void setStuDuty(String stuDuty) {
        this.stuDuty = stuDuty == null ? null : stuDuty.trim();
    }

    public String getStuLastIp() {
        return stuLastIp;
    }

    public void setStuLastIp(String stuLastIp) {
        this.stuLastIp = stuLastIp == null ? null : stuLastIp.trim();
    }

    public String getStuDepartment() {
        return stuDepartment;
    }

    public void setStuDepartment(String stuDepartment) {
        this.stuDepartment = stuDepartment == null ? null : stuDepartment.trim();
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor == null ? null : stuMajor.trim();
    }

    public Integer getStuLevel() {
        return stuLevel;
    }

    public void setStuLevel(Integer stuLevel) {
        this.stuLevel = stuLevel;
    }

    public String getStuGroupId() {
        return stuGroupId;
    }

    public void setStuGroupId(String stuGroupId) {
        this.stuGroupId = stuGroupId == null ? null : stuGroupId.trim();
    }
}