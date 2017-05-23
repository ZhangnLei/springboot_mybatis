package com.process.bean;

import java.security.Timestamp;

/**
 * Created by AIRobot on 2017/5/12.
 */
public class Authorization {
    private Integer auth_id;
    private String auth_code;
    private Timestamp create_time;
    private Timestamp expire_time;
    private Integer auth_level;
    private Integer status;
    private Integer affiliation;
    private String json;

    public Integer getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(Integer auth_id) {
        this.auth_id = auth_id;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(Timestamp expire_time) {
        this.expire_time = expire_time;
    }

    public Integer getAuth_level() {
        return auth_level;
    }

    public void setAuth_level(Integer auth_level) {
        this.auth_level = auth_level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Integer affiliation) {
        this.affiliation = affiliation;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
