package com.clownfish7.springcloud.controller;

import com.clownfish7.springcloud.entity.CommonResult;
import com.clownfish7.springcloud.entity.Payment;
import com.clownfish7.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author You
 * @create 2020-08-22 18:36
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private Integer serverPort;
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果: " + result);
        if (result > 0) {
            return new CommonResult(200, "插入结果集成功-serverPort=" + serverPort, result);
        } else {
            return new CommonResult(444, "插入结果集失败-serverPort=" + serverPort, null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("*****查询结果: " + result);
        if (null != result) {
            return new CommonResult(200, "查询成功-serverPort=" + serverPort, result);
        } else {
            return new CommonResult(444, "无对应记录-serverPort=" + serverPort, null);
        }
    }

    @GetMapping("/get/lb")
    public String getPaymentById() {
        return serverPort + "";
    }
}
