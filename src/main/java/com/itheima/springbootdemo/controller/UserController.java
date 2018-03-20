package com.itheima.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/test")
    @ResponseBody
    public String show() {
        return "springbootdemo";
    }
}
