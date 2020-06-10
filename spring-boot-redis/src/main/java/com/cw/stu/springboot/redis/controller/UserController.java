package com.cw.stu.springboot.redis.controller;

import com.cw.stu.springboot.redis.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

/**
 * @author WuLiangzhi  2019/06/17 16:22
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 获取User对象（自动根据方法生成缓存）
     * @param userName  String
     * @return  User
     */
    @RequestMapping("/getUser/{userName}")
    @Cacheable(value = "user-key")
    public User getUser(@PathVariable("userName") String userName){
        logger.info("getUser begin, userName={}", userName);
        User user = new User("aa@126.com", "aa", "aa123456", "aa",new Date());
        logger.info("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        String attrKey = "uid";
        UUID uuid = (UUID) session.getAttribute(attrKey);
        logger.info("uid, uuid={}", uuid);
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        session.setAttribute(attrKey, uuid);

        String sessionId = session.getId();
        logger.info("uid, sessionId={}", sessionId);
        return sessionId;
    }

}
