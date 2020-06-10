package com.cw.stu.springcloud.microservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cw.stu.springcloud.microservice.order.controller", "com.cw.stu.springcloud.microservice.order.service"})
public class SpringBootOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrderApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

