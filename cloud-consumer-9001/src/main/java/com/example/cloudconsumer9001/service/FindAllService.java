package com.example.cloudconsumer9001.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by junxiang on 2019/2/25 0025
 */
// 负载均衡
@FeignClient(name = "eureka-client")
public interface FindAllService {
    @RequestMapping("/findAll")
    String findAll();
}
