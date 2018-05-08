package com.tech.stack.controller;

import com.tech.stack.model.entity.Test;
import com.tech.stack.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangwei on 2018/5/8.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("gotoIndex")
    public String gotoIndex() {
        Test test = testService.findAll();
        System.out.println(test);
        return "index";
    }
}
