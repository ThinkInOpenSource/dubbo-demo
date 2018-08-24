package com.luo.demo.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.luo.demo.dubbo.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiangnan
 * date 2018/8/24 14:25
 */
@RestController
public class IndexController {

    @Reference(application = "dubbo-server")
    private HelloService helloService;

    @GetMapping("/")
    public String index() {
        return helloService.hello("world");
    }

}
