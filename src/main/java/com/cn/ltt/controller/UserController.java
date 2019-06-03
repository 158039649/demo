package com.cn.ltt.controller;

import com.cn.ltt.bean.Aliyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends SpringBootServletInitializer {

    @RequestMapping("login")
    public String login(){
        return "login success222";
    }
}
