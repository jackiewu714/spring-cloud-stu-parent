package com.cw.stu.springcloud.microservice.order.controller;

import com.cw.stu.springcloud.microservice.order.model.Order;
import com.cw.stu.springcloud.microservice.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单 Controller
 */
@RestController
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @GetMapping("order/{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId) {
        logger.info("queryOrderById, orderId={}", orderId);
        return orderService.queryOrderById(orderId);
    }
}
