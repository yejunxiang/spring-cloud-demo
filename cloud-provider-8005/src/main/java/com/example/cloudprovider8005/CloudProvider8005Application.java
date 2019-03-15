package com.example.cloudprovider8005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudProvider8005Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8005Application.class, args);
    }

}
