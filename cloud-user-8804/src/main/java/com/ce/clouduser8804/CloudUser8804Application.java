package com.ce.clouduser8804;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * `@EnableFeignClients` 开启Feign
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudUser8804Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudUser8804Application.class, args);
    }

    @Bean
    public Logger.Level feignConfiguration() {
        return Logger.Level.FULL;
    }
}
