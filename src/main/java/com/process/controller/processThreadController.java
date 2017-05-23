package com.process.controller;

import com.process.bean.ProcessThread;
import com.process.mapper.ProcessThreadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AIRobot on 2017/5/11.
 */

@RestController
@RequestMapping({"/home"})
public class processThreadController {
    @Autowired
    ProcessThreadMapper processThreadMapper;
    @RequestMapping(value = "/processThread")
    @ResponseBody
    public ProcessThread processThread(){
        ProcessThread processThread = processThreadMapper.findProcessThreadByThread_Id(4);
        return processThread;
    }

}
