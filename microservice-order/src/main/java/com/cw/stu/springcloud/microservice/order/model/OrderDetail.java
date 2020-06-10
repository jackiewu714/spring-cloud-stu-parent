package com.cw.stu.springcloud.microservice.order.model;

import com.alibaba.fastjson.JSON;

/**
 * 订单明细实体
 */
public class OrderDetail {

    private String orderId;

    private Product product = new Product();

    public OrderDetail() {

    }

    public OrderDetail(String orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
