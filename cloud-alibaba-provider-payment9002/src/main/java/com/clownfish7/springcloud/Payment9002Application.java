package com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yzy
 * @classname Payment9002Application
 * @description TODO
 * @create 2020-09-24 14:06
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9002Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment9002Application.class, args);
    }
}
