package com.clownfish7.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.clownfish7.springcloud.entity.CommonResult;
import com.clownfish7.springcloud.entity.Payment;

/**
 * @author You
 * @create 2020-10-03 1:14
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException", new Payment(2020L, "serial0003"));
    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException", new Payment(2020L, "serial0003"));
    }
}