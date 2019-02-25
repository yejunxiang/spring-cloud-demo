package com.example.cloudconsumer9001.fallback;

import com.example.cloudconsumer9001.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by junxiang on 2019/2/15 0015
 *  hello 服务降级实现，容错处理
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name + ",this is fallback";
    }

}
