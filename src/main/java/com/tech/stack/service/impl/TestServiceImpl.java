package com.tech.stack.service.impl;

import com.tech.stack.mapper.TestMapper;
import com.tech.stack.model.entity.Test;
import com.tech.stack.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangwei on 2018/5/8.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public Test findAll() {
        return testMapper.findAll();
    }
}
