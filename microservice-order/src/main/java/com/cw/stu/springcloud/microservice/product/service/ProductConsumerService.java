package com.cw.stu.springcloud.microservice.product.service;

import com.cw.stu.springcloud.microservice.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 商品客户端服务
 */
@Service
public class ProductConsumerService {

    /**
     * Spring框架对 RESTFUL 方式的http请求做了封装，来简化操作
     */
    @Autowired
    private RestTemplate restTemplate;

    public Product queryProductById(Long id){
        return this.restTemplate.getForObject("http://localhost:8081/product/find/"+id, Product.class);
    }


}
