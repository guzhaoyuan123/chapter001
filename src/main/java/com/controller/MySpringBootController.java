package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : 顾兆远
 * @program: chapter001
 * @description: 标准的Spring MVC控制器
 * @date : 2020-03-09 10:15
 **/

@Controller
@RequestMapping("/springWeb")
@ResponseBody
public class MySpringBootController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello,Spring Boot!";
    }
}
