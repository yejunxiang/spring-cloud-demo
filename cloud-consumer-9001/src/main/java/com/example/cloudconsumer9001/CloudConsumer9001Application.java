package com.example.cloudconsumer9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class CloudConsumer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumer9001Application.class, args);
    }

}

