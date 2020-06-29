package com.cw.stu.springcloud.microservice.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cw.stu.springcloud.microservice.product.controller", "com.cw.stu.springcloud.microservice.product.service"})
@EnableEurekaClient
public class SpringBootOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrderApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

