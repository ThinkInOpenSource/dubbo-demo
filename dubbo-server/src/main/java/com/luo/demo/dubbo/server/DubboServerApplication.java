package com.luo.demo.dubbo.server;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiangnan
 * date 2018/8/24 13:32
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.luo.demo.dubbo.server.service")
public class DubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServerApplication.class, args);
    }
}
