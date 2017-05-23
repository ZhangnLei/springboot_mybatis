
package com.process.bean;

        import java.security.Timestamp;

/**
 * Created by AIRobot on 2017/5/11.
 */
public class ProcessThread {
    private Integer thread_id;
    private Integer belong_process_id;
    private Integer thread_starter;
    private Timestamp thread_start_time;
    private Integer thread_step;
    private Integer thread_status;

    public Integer getThread_id() {
        return thread_id;
    }

    public void setThread_id(Integer thread_id) {
        this.thread_id = thread_id;
    }

    public Integer getBelong_process_id() {
        return belong_process_id;
    }

    public void setBelong_process_id(Integer belong_process_id) {
        this.belong_process_id = belong_process_id;
    }

    public Integer getThread_starter() {
        return thread_starter;
    }

    public void setThread_starter(Integer thread_starter) {
        this.thread_starter = thread_starter;
    }

    public Timestamp getThread_start_time() {
        return thread_start_time;
    }

    public void setThread_start_time(Timestamp thread_start_time) {
        this.thread_start_time = thread_start_time;
    }
    public Integer getThread_step() {
        return thread_step;
    }

    public void setThread_step(Integer thread_step) {
        this.thread_step = thread_step;
    }

    public Integer getThread_status() {
        return thread_status;
    }

    public void setThread_status(Integer thread_status) {
        this.thread_status = thread_status;
    }
}



