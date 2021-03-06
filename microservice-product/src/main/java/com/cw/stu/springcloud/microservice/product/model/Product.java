package com.cw.stu.springcloud.microservice.product.model;

import com.alibaba.fastjson.JSON;

/**
 * 商品实体类
 */
public class Product {

    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;

    public Product() {
    }

    public Product(long id, String title, String pic, String desc, Long price) {
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }
}
