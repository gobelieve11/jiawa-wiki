package com.jiawa.jiawa.wiki.controller;


import com.jiawa.jiawa.wiki.req.EbookReq;
import com.jiawa.jiawa.wiki.resp.CommonResp;
import com.jiawa.jiawa.wiki.resp.EbookResp;
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
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp =new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

}
