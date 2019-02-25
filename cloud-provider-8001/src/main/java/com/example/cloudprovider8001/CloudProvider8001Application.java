package com.example.cloudprovider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8001Application.class, args);
    }

}

