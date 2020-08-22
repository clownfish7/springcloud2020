package com.clownfish7.springcloud.controller;

import com.clownfish7.springcloud.Payment8001ApplicationTest;
import org.junit.jupiter.api.Test;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @author You
 * @create 2020-08-22 19:38
 */
class PaymentControllerTest extends Payment8001ApplicationTest {

    @Test
    void create() throws Exception {
//        this.mockMvc.perform(post("/payment/create").contentType(MediaType.APPLICATION_JSON)
//        .content("{}"))
    }

    @Test
    void getPaymentById() throws Exception {
        this.mockMvc.perform(get("/payment/get/{id}", 31))
                .andDo(print())
                .andExpect(status().isOk())
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