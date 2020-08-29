package com.clownfish7.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author You
 * @create 2020-08-29 18:33
 * @RefreshScope  注解能帮助我们做局部的参数刷新，但侵入性较强，需要开发阶段提前预知可能的刷新点，
 * 并且该注解底层是依赖于cglib进行代理的，所以不要掉入cglib的坑，出现刷了也不更新情况；
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String configInfo() {
        return configInfo;
    }
}
