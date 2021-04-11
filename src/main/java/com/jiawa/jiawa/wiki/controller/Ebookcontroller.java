package com.jiawa.jiawa.wiki.controller;

import com.jiawa.jiawa.wiki.domain.Ebook;
import com.jiawa.jiawa.wiki.resp.CommonResp;
import com.jiawa.jiawa.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(("/ebook"))
public class Ebookcontroller {

    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp =new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }

}
