package com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author yzy
 * @classname Order83Application
 * @description TODO
 * @create 2020-09-24 14:06
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Order83Application {
    public static void main(String[] args) {
        SpringApplication.run(Order83Application.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
