package com.clownfish7.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clownfish7.springcloud.entity.Storage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yzy
 * @classname StorageMapper
 * @description TODO
 * @create 2020-09-25 10:41
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {
}
