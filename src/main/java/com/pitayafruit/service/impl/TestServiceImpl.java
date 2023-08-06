package com.pitayafruit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pitayafruit.entity.Test;
import com.pitayafruit.mapper.TestMapper;
import com.pitayafruit.service.TestService;
import org.springframework.stereotype.Service;

/**
 * 测试接口实现
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {
}
