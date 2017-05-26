package com.process.controller;

import com.process.bean.Test;
import com.process.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangLei on 2017/5/24.
 */


@RestController
@RequestMapping({"/home"})
public class TestController {
    @Autowired
    TestMapper testMapper;
    @RequestMapping(value = "/test")
    @ResponseBody
    public Test test() throws Exception{

        //插入
        /*
        Test insert = new Test();
        insert.setName("安振");
        insert.setPassword("123546");
        int in = testMapper.insertTest(insert);
        System.out.println("update语句后影响的行数:"+in);            //开发
        return insert;
        */


        //查询
        /*
        Test test = testMapper.findTestByIdnew(4);
        return test;
        */

        //删除
        /* 放到函数中实现要注意函数返回类型为void
        int i = testMapper.deleteTest(5);
        System.out.println("update语句后影响的行数:"+i);            //开发
        */

        //修改
        /*
        //根据id修改 ，将要修改的id放到新建的bean中
        Test update = new Test();
        update.setName("update");
        update.setPassword("123");
        update.setId(7);
        int i = testMapper.updateTestById(update);
        System.out.println("update语句后影响的行数:"+i);            //开发
        return update;
        */

        //修改

        //根据name修改 ，将要修改的id放到新建的bean中
        Test update = new Test();
        update.setName("nihaoha");
        update.setPassword("123");
  //          update.setId(7);
        String name = "zhang";
        int i = testMapper.updateTestByName(update,name);
        System.out.println("update语句后影响的行数:"+i);            //开发
        return update;
    }
}
