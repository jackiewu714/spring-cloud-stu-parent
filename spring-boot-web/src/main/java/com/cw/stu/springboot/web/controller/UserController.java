package com.cw.stu.springboot.web.controller;

import com.alibaba.fastjson.JSON;
import com.cw.stu.springboot.helloworld.controller.HelloController;
import com.cw.stu.springboot.web.dao.UserRepository;
import com.cw.stu.springboot.web.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WuLiangzhi  2019/06/14 17:58
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUserByName/{userName}")
    public String getUserByName(@PathVariable("userName") String userName){
        logger.info("getUserByName begin, userName={}", userName);
        User user = userRepository.findUserByUserName(userName);
        String jsonStr = JSON.toJSONString(user);
        logger.info("getUserByName end, jsonStr={}", jsonStr);
        return jsonStr;
    }

    @RequestMapping("/getAllUser")
    public String getAllUser() {
        logger.info("getAllUser begin");
        List<User> userList = userRepository.findAll();
        String jsonStr = JSON.toJSONString(userList);
        logger.info("getAllUser end, jsonStr={}", jsonStr);
        return jsonStr;
    }

}
