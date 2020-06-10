package com.cw.stu.springboot.helloworld.controller;

import com.cw.stu.springboot.web.util.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WuLiangzhi  2018/12/19 20:39
 */
@RestController
//@RestController 注解： 该注解是 @Controller 和 @ResponseBody 注解的合体版
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private AppProperties appProperties;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        String response = "Hello Spring Boot! I'am " + name;
        System.out.println(response);
        logger.info("response: {}", response);
        return response;
    }

    @RequestMapping("/prop")
    public String prop(){
        String title = appProperties.getTitle();
        String description = appProperties.getDescription();
        String response = String.format("title=%s, description=%s", title, description);
        logger.info("prop, response: {}", response);
        return response;
    }


}
