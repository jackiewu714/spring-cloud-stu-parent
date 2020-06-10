package com.cw.stu.springboot.web.dao;

import com.cw.stu.springboot.web.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author WuLiangzhi  2019/06/14 17:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        Date date = new Date();
        userRepository.save(new User("aaa","123456","aaa@163.com","aaa的昵称",date));
        userRepository.save(new User("bbb","123456","bbb@163.com","bbb的昵称",date));
        userRepository.save(new User("ccc","123456","ccc@163.com","ccc的昵称",date));
        userRepository.save(new User("ddd","123456","ddd@163.com","ddd的昵称",date));

        Assert.assertEquals(4, userRepository.findAll().size());
        Assert.assertEquals("ccc", userRepository.findUserByUserNameOrEmail("ccc","ccc@163.com").getUserName());
    }

}
