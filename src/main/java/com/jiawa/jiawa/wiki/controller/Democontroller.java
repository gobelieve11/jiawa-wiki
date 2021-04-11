package com.jiawa.jiawa.wiki.controller;

import com.jiawa.jiawa.wiki.domain.Demo;
import com.jiawa.jiawa.wiki.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(("/demo"))
public class Democontroller {

    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }

}
