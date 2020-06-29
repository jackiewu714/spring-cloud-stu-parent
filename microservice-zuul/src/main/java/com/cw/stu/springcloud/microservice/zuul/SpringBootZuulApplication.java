package com.cw.stu.springcloud.microservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * spring cloud的网关
 *
 * @author WuLiangzhi  2020/06/29 15:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringBootZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootZuulApplication.class, args);
    }

}
