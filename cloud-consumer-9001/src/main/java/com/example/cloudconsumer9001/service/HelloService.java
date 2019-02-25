package com.example.cloudconsumer9001.service;

import com.example.cloudconsumer9001.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by junxiang on 2019/2/15 0015
 */
// @FeignClient注解  name属性：通知feign在调用该接口时向Eureka注册中心服务器中查找名为“eureka-client”的服务，从而得到服务url
@FeignClient(name = "eureka-client", fallback = HelloServiceFallback.class)
public interface HelloService {
    @RequestMapping("/hello")
    String sayHello(@RequestParam("name") String name);
}
