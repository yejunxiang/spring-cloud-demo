package com.example.cloudconsumer9001.controller;

import com.example.cloudconsumer9001.service.FindAllService;
import com.example.cloudconsumer9001.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "findAllFallback")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public String findAll() throws InterruptedException {
        Thread.sleep(8000);
        return findAllService.findAll();
    }

    protected String findAllFallback() {
        return "this just a fallback for findAll!!!";
    }
}
