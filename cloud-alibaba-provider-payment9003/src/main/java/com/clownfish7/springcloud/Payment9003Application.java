package com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author You
 * @create 2020-10-03 1:21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9003Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment9003Application.class, args);
    }
}
