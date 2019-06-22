package com.dashuai.maybe.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Da Shuai
 * @create: 2019-06-23 00:48
 */
@Api(tags = "demo",description = "测试")
@RestController
@RequestMapping("demo")
public class DemoController {
    @ApiOperation(value = "测试get接口",notes = "测试")
    @GetMapping
    public String demo(){
        return "demo1112";
    }
}
