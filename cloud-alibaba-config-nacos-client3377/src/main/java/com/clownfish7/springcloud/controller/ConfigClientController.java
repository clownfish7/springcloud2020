package com.clownfish7.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @classname ConfigClientController
 * @description TODO
 * @create 2020-09-24 15:37
 */
@RefreshScope
@RestController //通过Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
