package com.cw.stu.springboot.redis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Spring Redis Session 配置
 * maxInactiveIntervalInSeconds: 设置 Session 失效时间，使用 Redis Session 之后，原 Spring Boot 的 server.session.timeout 属性不再生效。
 * @author WuLiangzhi  2019/06/17 17:16
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 2*60*60)
public class SessionConfig {
}
