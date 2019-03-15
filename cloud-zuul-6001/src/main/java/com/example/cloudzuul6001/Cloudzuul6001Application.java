package com.example.cloudzuul6001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Cloudzuul6001Application {

    public static void main(String[] args) {
        SpringApplication.run(Cloudzuul6001Application.class, args);
    }

}
