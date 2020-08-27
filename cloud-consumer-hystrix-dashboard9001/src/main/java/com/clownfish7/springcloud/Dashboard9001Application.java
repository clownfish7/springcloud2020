package com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author yzy
 * @classname Payment8008Application
 * @description TODO
 * @create 2020-08-27 15:09
 */
@EnableHystrixDashboard
@SpringBootApplication
public class Dashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(Dashboard9001Application.class, args);
    }
}
