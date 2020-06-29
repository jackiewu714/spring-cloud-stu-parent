package com.cw.stu.springcloud.microservice.product.service;

import com.cw.stu.springcloud.microservice.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品服务雷
 */
@Service
public class ProductService {

    private static final Map<Long, Product> productMap = new HashMap<>();

    static {
        // 准备静态数据模拟数据库
        productMap.put(1L, new Product(1L, "商品1", "http://图片1", "商品描述1", 1000L));
        productMap.put(2L, new Product(2L, "商品2", "http://图片2", "商品描述2", 2000L));
        productMap.put(3L, new Product(3L, "商品3", "http://图片3", "商品描述3", 3000L));
        productMap.put(4L, new Product(4L, "商品4", "http://图片4", "商品描述4", 4000L));
        productMap.put(5L, new Product(5L, "商品5", "http://图片5", "商品描述5", 5000L));
        productMap.put(6L, new Product(6L, "商品6", "http://图片6", "商品描述6", 6000L));
        productMap.put(7L, new Product(7L, "商品7", "http://图片7", "商品描述7", 7000L));
        productMap.put(8L, new Product(8L, "商品8", "http://图片8", "商品描述8", 8000L));
        productMap.put(8L, new Product(9L, "商品9", "http://图片9", "商品描述9", 9000L));
        productMap.put(8L, new Product(10L, "商品10", "http://图片10", "商品描述10", 10000L));
    }

    /**
     * 根据id查询商品
     * @param id    Long
     * @return  Product
     */
    public Product queryProductById(Long id) {
        return productMap.get(id);
    }

}
