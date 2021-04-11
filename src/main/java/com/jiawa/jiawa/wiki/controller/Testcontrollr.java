package com.jiawa.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class Testcontrollr {
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


}
