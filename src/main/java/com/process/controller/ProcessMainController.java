package com.process.controller;

import com.process.bean.ProcessMain;
import com.process.mapper.ProcessMainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AIRobot on 2017/5/12.
 */

@RestController
@RequestMapping({"/home"})
public class ProcessMainController {
    @Autowired
    ProcessMainMapper processMainMapper;
    @RequestMapping(value = "/processMain")
    @ResponseBody
    public ProcessMain processMain(){
        ProcessMain processMain = processMainMapper.findProcessMainByProcessMainId(1);
        return processMain;
    }
}
