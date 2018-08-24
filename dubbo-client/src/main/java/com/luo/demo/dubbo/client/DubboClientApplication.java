package com.luo.demo.dubbo.client;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiangnan
 * date 2018/8/24 14:24
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.luo.demo.dubbo.client.controller")
public class DubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }
}
