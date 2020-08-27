package com.clownfish7.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yzy
 * @classname FeignService
 * @description TODO
 * @create 2020-08-27 15:44
 */
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT",  path = "/payment")
public interface FeignService {

    @GetMapping("/timeout/{id}")
    public String timeout(@PathVariable("id") Integer id);


    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id);

    @GetMapping("/hystrix/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id);

}
