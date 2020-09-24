package com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yzy
 * @classname NacosConfigClient3377Application
 * @description TODO
 * @create 2020-09-24 15:26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClient3377Application {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient3377Application.class, args);
    }
}
