package com.example.cloudconsumer9001.controller;

import com.example.cloudconsumer9001.service.FindAllService;
import com.example.cloudconsumer9001.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junxiang on 2019/2/15 0015
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private FindAllService findAllService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }

    /**
     * @HystrixCommand 熔断处理
     * @return
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public String findAll() {
        System.out.println("哈哈哈哈哈！");
        return findAllService.findAll();
    }
}
