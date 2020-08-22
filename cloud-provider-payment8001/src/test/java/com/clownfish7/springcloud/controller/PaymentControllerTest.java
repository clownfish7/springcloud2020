package com.clownfish7.springcloud.controller;

import com.clownfish7.springcloud.Payment8001ApplicationTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;


/**
 * @author You
 * @create 2020-08-22 19:38
 *
 * @Transactional   开启事务
 * @Rollback        执行单元测试后回滚
 * @Disabled        不执行此单元测试
 * .optional()  - Marks the field as optional. API文档上写的使 Mark 暂时好像就只是打个标记标识可选，生成的文档中没有看到
 * .ignored()   - 忽略，生成的文档中不显示此字段
 */
class PaymentControllerTest extends Payment8001ApplicationTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @Transactional
    @Rollback
    void create() throws Exception {
        HashMap<String, Object> requestBody = new HashMap<>();
        requestBody.put("id", null);
        requestBody.put("serial", "clownfish");

        this.mockMvc.perform(post("/payment/create")
                .content(objectMapper.writeValueAsString(requestBody)))
                .andDo(document("{ClassName}/{methodName}",
                        requestFields(
                                fieldWithPath("id").description("id").ignored().type("Integer"),
                                fieldWithPath("serial").optional().description("serial").type("String")),
                        responseFields(
                                fieldWithPath("code").description("code"),
                                fieldWithPath("message").description("message"),
                                fieldWithPath("data").description("insert num")
                        )
                ));
    }

    @Test
    @Disabled
    void getPaymentById() throws Exception {
        this.mockMvc.perform(get("/payment/get/{id}", 31))
                .andDo(document("{ClassName}/{methodName}",
                        pathParameters(
                                parameterWithName("id").description("the payment id")),
                        responseFields(
                                fieldWithPath("code").optional().description("id"),
                                fieldWithPath("message").optional().description("id"),
                                fieldWithPath("data.id").optional().description("id"),
                                fieldWithPath("data.serial").optional().description("serial")
                        )
                ));
    }
}