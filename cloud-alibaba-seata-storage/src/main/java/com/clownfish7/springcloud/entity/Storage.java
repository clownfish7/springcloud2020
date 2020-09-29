package com.clownfish7.springcloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author yzy
 * @classname Storage
 * @description TODO
 * @create 2020-09-25 10:40
 */
@Data
@Accessors(chain = true)
@TableName("storage_tbl")
public class Storage {

    private Long id;
    private String commodityCode;
    private Long count;

}
