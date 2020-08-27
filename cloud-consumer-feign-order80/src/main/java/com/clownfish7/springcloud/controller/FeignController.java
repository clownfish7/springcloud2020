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

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public String getPaymentById(@PathVariable("id") Long id) {
        return feignService.getPaymentById(id);
    }

    /**
     * 模拟feign超时
     *
     * @return
     */
    @GetMapping(value = "/payment/timeout/{id}")
    public String paymentFeignTimeout(@PathVariable("id") Long id) {
        // openfeign-ribbon, 客户端一般默认等待1秒钟
        return feignService.paymentFeignTimeout(id);
    }
}
