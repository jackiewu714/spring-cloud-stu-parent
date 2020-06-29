package com.cw.stu.springcloud.microservice.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cw.stu.springcloud.microservice.product.controller", "com.cw.stu.springcloud.microservice.product.service"})
@EnableEurekaClient
public class SpringBootProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProductApplication.class, args);
    }

}

