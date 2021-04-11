package com.jiawa.jiawa.wiki.service;

import com.jiawa.jiawa.wiki.domain.Test;
import com.jiawa.jiawa.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();

    }
}
