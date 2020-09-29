package com.clownfish7.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yzy
 * @classname StorageFeignClient
 * @description TODO
 * @create 2020-09-25 10:31
 */
@FeignClient(value = "cloud-seata-storage")
public interface StorageFeignClient {

    @GetMapping("/storage/deduct")
    Boolean deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);

}
