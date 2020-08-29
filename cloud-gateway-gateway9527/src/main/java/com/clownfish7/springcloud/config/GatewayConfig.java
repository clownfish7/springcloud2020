package com.clownfish7.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author You
 * @create 2020-08-29 16:05
 */
@Configuration
public class GatewayConfig {

    /**
     * 代码方式配置路由转发规则
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("toBaiduGuoNei", r -> r.path("/guonei").uri("https://news.baidu.com/guonei"))
                .build();
    }
}
