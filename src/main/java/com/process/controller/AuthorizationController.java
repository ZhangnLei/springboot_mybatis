package com.process.controller;

import com.process.bean.Authorization;
import com.process.mapper.AuthorizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AIRobot on 2017/5/12.
 */
@RestController
@RequestMapping({"/home"})
public class AuthorizationController {
    @Autowired
    AuthorizationMapper authorizationMapper;
    @RequestMapping(value = "authorization")
    @ResponseBody
    public Authorization authorization(){
        Authorization authorization= authorizationMapper.findAuthorizationByAuthId(1);
        return authorization;
    }
}
