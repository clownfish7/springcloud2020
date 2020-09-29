package com.clownfish7.springcloud;


import com.alibaba.druid.proxy.jdbc.DataSourceProxy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

/**
 * @author yzy
 * @classname SeataOrderApplicationTest
 * @description TODO
 * @create 2020-09-25 15:56
 */
@SpringBootTest
class SeataOrderApplicationTest {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private DataSourceProxy dataSourceProxy;

    @Test
    public void a() {
        System.out.println("a");
    }
}