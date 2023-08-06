package com.pitayafruit.controller;

import com.pitayafruit.entity.Test;
import com.pitayafruit.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试控制类
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;


    @GetMapping("/1")
    public String testResponse2() {
        return "111";
    }
}
