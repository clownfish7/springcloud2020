package com.clownfish7.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clownfish7.springcloud.model.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yzy
 * @classname OrderMapper
 * @description TODO
 * @create 2020-09-25 10:14
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
