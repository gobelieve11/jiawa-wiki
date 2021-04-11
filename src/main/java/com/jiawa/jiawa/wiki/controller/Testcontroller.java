package com.jiawa.jiawa.wiki.controller;

import com.jiawa.jiawa.wiki.domain.Test;
import com.jiawa.jiawa.wiki.mapper.TestMapper;
import com.jiawa.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class Testcontroller {

    @Resource
    private TestService testService;

    @Value("${test.hello}")
    private String hello;
    @GetMapping("/hello")
    public String hello(){
        return ("Hello World!"+hello);
    }

    @PostMapping("/hello/post")
    public String hello_post(String name){
        return ("Hello World! Post" +name);
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

}
