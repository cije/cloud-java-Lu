package com.ce.cloudorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * `@EnableHystrix` 开启断路器
 */
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class CloudOrderApplication {

    /**
     * `@LoadBalanced`注解 声明当前的RestTemplate具有ribbon负载均衡的能力
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudOrderApplication.class, args);
    }

}
