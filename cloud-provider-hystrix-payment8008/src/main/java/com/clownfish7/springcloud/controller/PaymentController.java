package com.clownfish7.springcloud.controller;

import com.clownfish7.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @classname PaymentController
 * @description TODO
 * @create 2020-08-27 15:13
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/get/{id}")
    public String ok(@PathVariable("id") Integer id) {
        final String result = paymentService.ok(id);
        log.info("***result:" + result);
        return result;
    }

    @GetMapping("/timeout/{id}")
    public String timeout(@PathVariable("id") Integer id) {
        final String result = paymentService.timeOut(id);
        log.info("***result:" + result);
        return result;
    }


    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        final String result = paymentService.paymentInfo_TimeOut(id);
        log.info("***result:" + result);
        return result;
    }

    @GetMapping("/hystrix/global/timeout/{id}")
    public String paymentInfoTimeOutGlobal(@PathVariable("id") Integer id) {
        final String result = paymentService.paymentInfo_TimeOut_Global(id);
        log.info("***result:" + result);
        return result;
    }

    @GetMapping("/hystrix/circuit/{id}")
    @HystrixCommand
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("***result:" + result);
        return result;
    }

    @GetMapping("/hystrix/global/circuit/{id}")
    @HystrixCommand
    public String paymentCircuitBreakerGlobal(@PathVariable("id") Integer id) {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("***result:" + result);
        return result;
    }
}
