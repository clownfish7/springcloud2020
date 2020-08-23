package com.clownfish7.springcloud.impl;

import com.clownfish7.springcloud.dao.PaymentDao;
import com.clownfish7.springcloud.entity.Payment;
import com.clownfish7.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author You
 * @create 2020-08-22 18:34
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
