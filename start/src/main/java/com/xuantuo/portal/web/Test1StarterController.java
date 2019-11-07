package com.xuantuo.portal.web;

import com.xuantuo.portal.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/7
 **/
@RestController
public class Test1StarterController {

    @Resource
    private DemoService demoService;


    @GetMapping("/say")
    public String sayWhat() {
        return demoService.say();
    }
}
