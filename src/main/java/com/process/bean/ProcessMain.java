package com.process.bean;

import java.security.Timestamp;

/**
 * Created by AIRobot on 2017/5/12.
 */
public class ProcessMain {
    private Integer process_main_id;
    private Integer process_starter;
    private Integer process_supervisor;
    private Integer process_model;
    private Integer process_priority;
    private Integer process_step;
    private byte has_thread;
    private Timestamp create_time;
    private Timestamp start_time;
    private Timestamp deadline;
    private Timestamp end_time;
    private Integer process_status;

    public Integer getProcess_main_id() {
        return process_main_id;
    }

    public void setProcess_main_id(Integer process_main_id) {
        this.process_main_id = process_main_id;
    }

    public Integer getProcess_starter() {
        return process_starter;
    }

    public void setProcess_starter(Integer process_starter) {
        this.process_starter = process_starter;
    }

    public Integer getProcess_supervisor() {
        return process_supervisor;
    }

    public void setProcess_supervisor(Integer process_supervisor) {
        this.process_supervisor = process_supervisor;
    }

    public Integer getProcess_model() {
        return process_model;
    }

    public void setProcess_model(Integer process_model) {
        this.process_model = process_model;
    }

    public Integer getProcess_priority() {
        return process_priority;
    }

    public void setProcess_priority(Integer process_priority) {
        this.process_priority = process_priority;
    }

    public Integer getProcess_step() {
        return process_step;
    }

    public void setProcess_step(Integer process_step) {
        this.process_step = process_step;
    }

    public byte getHas_thread() {
        return has_thread;
    }

    public void setHas_thread(byte has_thread) {
        this.has_thread = has_thread;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public Timestamp getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Timestamp end_time) {
        this.end_time = end_time;
    }

    public Integer getProcess_status() {
        return process_status;
    }

    public void setProcess_status(Integer process_status) {
        this.process_status = process_status;
    }
}
