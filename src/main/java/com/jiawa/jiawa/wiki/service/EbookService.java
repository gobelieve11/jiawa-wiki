package com.jiawa.jiawa.wiki.service;


import com.fasterxml.jackson.databind.util.BeanUtil;
import com.jiawa.jiawa.wiki.domain.Ebook;
import com.jiawa.jiawa.wiki.domain.EbookExample;
import com.jiawa.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.jiawa.wiki.req.EbookReq;
import com.jiawa.jiawa.wiki.resp.EbookResp;
import com.jiawa.jiawa.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList =ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList =new ArrayList<>();
//        for (Ebook ebook : ebookList) {

//  //  EbookResp resp = new EbookResp();
// //   BeanUtils.copyProperties(ebook,resp);
//                             //对象复制
//            EbookResp resp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(resp);
//
//        }
        return CopyUtil.copyList(ebookList, EbookResp.class);




    }
}
