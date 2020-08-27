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
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface FeignService {

    @GetMapping(value = "/payment/get/{id}")
    String getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/timeout/{id}")
    String paymentFeignTimeout(@PathVariable("id") Long id);
}
