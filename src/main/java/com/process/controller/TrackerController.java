package com.process.controller;

//import com.process.mapper.TrackerMapper;

import com.process.bean.Tracker;
import com.process.mapper.TrackerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AIRobot on 2017/5/12.
 */

@RestController
@RequestMapping({"/home"})
public class TrackerController {
    @Autowired
    TrackerMapper trackerMapper;
    @RequestMapping(value = "/tracker")
    @ResponseBody
    public Tracker tracker(){
    Tracker tracker = trackerMapper.findTrackerByTraceId(1);
    return tracker;
    }
}

