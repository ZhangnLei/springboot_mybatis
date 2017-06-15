package com.process.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mrzhang on 2017/6/15.
 */

@RestController
public class IndexController {
    @RequestMapping(value = "/getua")
    public void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException{
        String ua = request.getHeader("User-Agent");

        PrintWriter writer = response.getWriter();
        writer.write("hello,your user agent is :"+ua);

        writer.flush();
        //writer.close();
    }
}
