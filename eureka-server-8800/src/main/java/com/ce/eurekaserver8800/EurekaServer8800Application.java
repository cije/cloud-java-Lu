package com.ce.eurekaserver8800;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 声明当前项目为eureka server
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8800Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8800Application.class, args);
    }

}
