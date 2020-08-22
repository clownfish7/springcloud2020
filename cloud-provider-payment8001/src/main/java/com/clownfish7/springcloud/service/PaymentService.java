package com.clownfish7.springcloud.service;

import com.clownfish7.springcloud.entity.Payment;

/**
 * @author You
 * @create 2020-08-22 18:34
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
