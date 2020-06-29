package com.cw.stu.springcloud.microservice.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * spring cloud的网关
 *
 * @author WuLiangzhi  2020/06/29 15:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.cw.stu.springcloud.microservice.consumer.feign.client")    //feign接口的地址
public class SpringBootConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerFeignApplication.class, args);
    }

}
