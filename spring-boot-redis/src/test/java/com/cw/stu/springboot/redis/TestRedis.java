package com.cw.stu.springboot.redis;

import com.cw.stu.springboot.redis.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author WuLiangzhi  2019/06/17 16:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    private static final Logger logger = LoggerFactory.getLogger(TestRedis.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString(){
        stringRedisTemplate.opsForValue().set("bbb", "222");
        Assert.assertEquals("2222", stringRedisTemplate.opsForValue().get("bbb"));
    }

    @Test
    public void testObject(){
        User user = new User("aa@126.com", "aa", "aa123456", "aa",new Date());
        final ValueOperations<String, User> valueOperations = redisTemplate.opsForValue();

        String key1 = "springboot.aaa";
        String key2 = "springboot.bbb";
        valueOperations.set(key1, user);
        valueOperations.set(key2, user,5, TimeUnit.SECONDS);

        try {
            Thread.sleep(4990);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }

        boolean exists1 = redisTemplate.hasKey(key1);
        boolean exists2 = redisTemplate.hasKey(key2);
        logger.info("exists1={}", exists1);
        logger.info("exists2={}", exists2);
    }

}
