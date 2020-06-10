package com.cw.stu.springcloud.microservice.order.controller;

import com.cw.stu.springcloud.microservice.order.model.Product;
import com.cw.stu.springcloud.microservice.order.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品 controller
 */
@RestController
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping("/product/{id}")
    public Product queryProductById(@PathVariable("id") Long id) {
        logger.info("queryProductById, id={}", id);
        return productService.queryProductById(id);
    }

}
