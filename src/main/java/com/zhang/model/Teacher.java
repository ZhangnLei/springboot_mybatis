package com.zhang.model;

public class Teacher {
    private String teaId;

    private String teaName;

    private String teaTel;

    private String teaEmail;

    private String teaDepartment;

    private String teaDirection;

    private String teaType;

    private String teaGrade;

    private Byte teaPower;

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId == null ? null : teaId.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaTel() {
        return teaTel;
    }

    public void setTeaTel(String teaTel) {
        this.teaTel = teaTel == null ? null : teaTel.trim();
    }

    public String getTeaEmail() {
        return teaEmail;
    }

    public void setTeaEmail(String teaEmail) {
        this.teaEmail = teaEmail == null ? null : teaEmail.trim();
    }

    public String getTeaDepartment() {
        return teaDepartment;
    }

    public void setTeaDepartment(String teaDepartment) {
        this.teaDepartment = teaDepartment == null ? null : teaDepartment.trim();
    }

    public String getTeaDirection() {
        return teaDirection;
    }

    public void setTeaDirection(String teaDirection) {
        this.teaDirection = teaDirection == null ? null : teaDirection.trim();
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType == null ? null : teaType.trim();
    }

    public String getTeaGrade() {
        return teaGrade;
    }

    public void setTeaGrade(String teaGrade) {
        this.teaGrade = teaGrade == null ? null : teaGrade.trim();
    }

    public Byte getTeaPower() {
        return teaPower;
    }

    public void setTeaPower(Byte teaPower) {
        this.teaPower = teaPower;
    }
}