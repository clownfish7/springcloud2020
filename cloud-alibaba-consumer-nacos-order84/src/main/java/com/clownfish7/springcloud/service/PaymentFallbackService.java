package com.clownfish7.springcloud.service;

import com.clownfish7.springcloud.entity.CommonResult;
import com.clownfish7.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

/**
 * @author You
 * @create 2020-10-03 1:40
 */
@Service
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> PaymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，----PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
