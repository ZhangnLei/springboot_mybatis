package com.process.bean;

/**
 * Created by AIRobot on 2017/5/12.
 */
public class Access {
    private Integer system_id;
    private String system_name;
    private String system_info;
    private String access_ip;
    private String system_domain;

    public Integer getSystem_id() {
        return system_id;
    }

    public void setSystem_id(Integer system_id) {
        this.system_id = system_id;
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public String getSystem_info() {
        return system_info;
    }

    public void setSystem_info(String system_info) {
        this.system_info = system_info;
    }

    public String getAccess_ip() {
        return access_ip;
    }

    public void setAccess_ip(String access_ip) {
        this.access_ip = access_ip;
    }

    public String getSystem_domain() {
        return system_domain;
    }

    public void setSystem_domain(String system_domain) {
        this.system_domain = system_domain;
    }
}
