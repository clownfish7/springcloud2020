package java.com.clownfish7.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author You
 * @create 2020-08-22 17:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8006Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8006Application.class, args);
    }
}
