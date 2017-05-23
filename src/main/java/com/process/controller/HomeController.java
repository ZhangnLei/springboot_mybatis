package com.process.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by AIRobot on 2017/5/17.
 */

@Controller
public class HomeController {
    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String home() {
        return "index";
    }
}
