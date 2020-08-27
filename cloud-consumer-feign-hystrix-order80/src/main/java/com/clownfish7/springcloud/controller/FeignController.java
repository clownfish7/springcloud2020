package com.clownfish7.springcloud.controller;

import com.clownfish7.springcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @classname FeignController
 * @description TODO
 * @create 2020-08-27 15:46
 */
@RestController
@RequestMapping("/consumer")
public class FeignController {

    @Autowired
    private FeignService feignService;


    @GetMapping(value = "/payment/get/{id}")
    public String timeout(@PathVariable("id") Integer id) {
        return feignService.timeout(id);
    }

    @GetMapping(value = "/payment//hystrix/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        // openfeign-ribbon, 客户端一般默认等待1秒钟
        return feignService.paymentInfoTimeOut(id);
    }

    @GetMapping(value = "/payment/hystrix/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        // openfeign-ribbon, 客户端一般默认等待1秒钟
        return feignService.paymentCircuitBreaker(id);
    }
}
