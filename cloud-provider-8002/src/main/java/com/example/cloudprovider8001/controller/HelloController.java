package com.example.cloudprovider8001.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junxiang on 2019/2/15 0015
 * 服务提供者
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return "hello, " + name + ", this is second provider";
    }

    @RequestMapping("/findAll")
    public String findAll() {
        return "this is findAll service, just second provider";
    }
}
