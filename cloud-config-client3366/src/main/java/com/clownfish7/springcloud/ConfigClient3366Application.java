package com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author You
 * @create 2020-08-29 18:31
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient3366Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366Application.class, args);
    }
}
