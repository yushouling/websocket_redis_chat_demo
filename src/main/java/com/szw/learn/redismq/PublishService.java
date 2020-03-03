package com.szw.learn.redismq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis发布消息
 */
@Component
public class PublishService {
    @Autowired
    StringRedisTemplate redisTemplate;

    /**
     * 发布
     *
     * @param channel 消息发布订阅主题
     * @param message 消息信息
     */
    public void publish(String channel, Object message) {
        redisTemplate.convertAndSend(channel, message);
    }
}
