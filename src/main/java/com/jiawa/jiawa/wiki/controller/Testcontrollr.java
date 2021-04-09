package com.jiawa.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontrollr {

    @RequestMapping("/hello")
    public String hello(){
        return ("Hello World!");
    }


}
