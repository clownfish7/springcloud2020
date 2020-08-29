package com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author You
 * @create 2020-08-29 17:27
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigCenter3344Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344Application.class, args);
    }
}
