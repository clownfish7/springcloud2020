package java.com.clownfish7.springcloud.controller;

import com.clownfish7.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author You
 * @create 2020-08-22 18:36
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/consul")
    public String create(@RequestBody Payment payment) {
        return "springcloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
