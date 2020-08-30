package com.clownfish7.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author You
 * @create 2020-08-29 22:19
 * @EnableBinding 已包含 @Configuration -> 包含 @Component
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        output.send(MessageBuilder.withPayload(UUID.randomUUID().toString()).build());
        return "ok";
    }
}
