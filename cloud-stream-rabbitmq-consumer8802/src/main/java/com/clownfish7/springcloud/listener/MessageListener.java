package com.clownfish7.springcloud.listener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author You
 * @create 2020-08-30 16:56
 * @EnableBinding 已包含 @Configuration -> 包含 @Component
 */
@EnableBinding(Sink.class)
public class MessageListener {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println(message.getPayload());
    }

}
