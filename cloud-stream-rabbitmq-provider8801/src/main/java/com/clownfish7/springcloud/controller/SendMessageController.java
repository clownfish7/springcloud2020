package com.clownfish7.springcloud.controller;

import com.clownfish7.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author You
 * @create 2020-08-29 22:18
 */
@RestController
public class SendMessageController {

    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping
    public String send() {
        messageProvider.send();
        return "ok";
    }
}
