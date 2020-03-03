package com.szw.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsMqApplication {

    /**
     * 测试：
     * <p>
     * 　　启动两个服务，端口号分别8081、8082（可以+）
     * <p>
     * 　　模拟两个端口的地址：
     * <p>
     * 　　　　http://localhost:8081/websocket/index/like/董志峰
     * <p>
     * 　　　　http://localhost:8082/websocket/index/like/史振伟
     *
     * @param args
     */
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(WsMqApplication.class, args);
    }
}
