package com.cw.stu.springcloud.microservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cw.stu.springcloud.microservice.order.controller", "com.cw.stu.springcloud.microservice.order.service"})
public class SpringBootProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProductApplication.class, args);
    }

}

