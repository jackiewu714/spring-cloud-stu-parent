package com.cw.stu.springcloud.microservice.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server 注册中心启动类
 * @author WuLiangzhi  2020/06/29 14:38
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaServerApplication.class, args);
    }

}
