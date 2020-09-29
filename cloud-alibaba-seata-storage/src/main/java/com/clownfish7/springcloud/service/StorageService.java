package com.clownfish7.springcloud.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.clownfish7.springcloud.dao.StorageMapper;
import com.clownfish7.springcloud.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yzy
 * @classname StorageService
 * @description TODO
 * @create 2020-09-25 10:41
 */
@Service
public class StorageService {

    @Autowired
    private StorageMapper storageMapper;

    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     */
    @Transactional(rollbackFor = Exception.class)
    public void deduct(String commodityCode, int count) {
        if (commodityCode.equals("product-2")) {
            throw new RuntimeException("异常:模拟业务异常:Storage branch exception");
        }

        QueryWrapper<Storage> wrapper = new QueryWrapper<>();
        wrapper.setEntity(new Storage().setCommodityCode(commodityCode));
        Storage storage = storageMapper.selectOne(wrapper);
        storage.setCount(storage.getCount() - count);

        storageMapper.updateById(storage);
    }
}
