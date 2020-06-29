package com.cw.stu.springcloud.microservice.consumer.feign.controller;

import com.cw.stu.springcloud.microservice.consumer.feign.client.DataClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WuLiangzhi  2020/06/29 17:06
 */
@RestController
@RequestMapping("/feignConsumer")
public class DataFeignController {

    private static final Logger logger = LoggerFactory.getLogger(DataFeignController.class);

    @Autowired
    private DataClient m_dataClient;

    @RequestMapping("/findProduct/{id}")
    public String findProduct(@PathVariable("id") Long id){
        final String data = m_dataClient.getData(id);
        logger.info("findProduct, data={}", data);
        return data;
    }
}
