package com.process.bean;

import java.security.Timestamp;

/**
 * Created by AIRobot on 2017/5/12.
 */
public class Tracker {
    private Integer trace_id;
    private byte is_process;
    private Integer trace_maker;
    private Timestamp trace_time;
    private Integer origin_status;
    private Integer after_status;
    private Integer flag;

    public Integer getTrace_id() {
        return trace_id;
    }

    public void setTrace_id(Integer trace_id) {
        this.trace_id = trace_id;
    }

    public byte getIs_process() {
        return is_process;
    }

    public void setIs_process(byte is_process) {
        this.is_process = is_process;
    }

    public Integer getTrace_maker() {
        return trace_maker;
    }

    public void setTrace_maker(Integer trace_maker) {
        this.trace_maker = trace_maker;
    }

    public Timestamp getTrace_time() {
        return trace_time;
    }

    public void setTrace_time(Timestamp trace_time) {
        this.trace_time = trace_time;
    }

    public Integer getOrigin_status() {
        return origin_status;
    }

    public void setOrigin_status(Integer origin_status) {
        this.origin_status = origin_status;
    }

    public Integer getAfter_status() {
        return after_status;
    }

    public void setAfter_status(Integer after_status) {
        this.after_status = after_status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
