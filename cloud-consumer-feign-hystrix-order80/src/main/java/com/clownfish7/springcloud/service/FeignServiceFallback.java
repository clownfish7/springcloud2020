package com.clownfish7.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author yzy
 * @classname FeignServiceFallback
 * @description TODO
 * @create 2020-08-27 17:17
 */
@Component
public class FeignServiceFallback implements FeignService {
    @Override
    public String timeout(Integer id) {
        return "feign fullback";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "feign fullback";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "feign fullback";
    }
}
