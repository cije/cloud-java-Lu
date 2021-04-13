package com.ce.clouduser8804;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <code>@EnableEurekaClient</code> 声明当前项目为一个Eureka客户端 只能注册到Eureka
 * <code>@EnableDiscoveryClient</code> 声明当前项目为一个可以被发现客户端 不仅可以注册到Eureka注册中心还可以注册到其他的注册中心
 * <p>
 * 一般使用<code>@EnableDiscoveryClient</code>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudUser8804Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudUser8804Application.class, args);
    }

}
