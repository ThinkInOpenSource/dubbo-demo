package com.luo.demo.dubbo.server.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.luo.demo.dubbo.api.HelloService;

/**
 * @author xiangnan
 * date 2018/8/24 14:09
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String msg) {
        return "hello " + msg;
    }
}
