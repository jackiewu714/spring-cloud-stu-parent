package com.cw.stu.springboot.web.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author WuLiangzhi  2019/06/14 16:35
 */
@Component
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class AppProperties {

    @Value("${com.cw.title}")
    private String title;

    @Value("${com.cw.description}")
    private String description;

    /* ----------------------------------------华丽的分割线--------------------------------------------------------- */

    /**
     * 获取 title 属性
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 title 属性
     *
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取 description 属性
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 description 属性
     *
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
