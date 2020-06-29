package com.cw.stu.springcloud.microservice.consumer.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Feign consumer方式调用 Provider 的服务
 * @author WuLiangzhi  2020/06/29 17:01
 */
@FeignClient(value = "TEST-PROVIDER")   //要调用的服务名称
@RequestMapping("/product2")            //和调用服务controller的一致
public interface DataClient {

    @RequestMapping("/find/{id}")       //和调用服务controller的一致
    String getData(@PathVariable("id") Long id);

}
