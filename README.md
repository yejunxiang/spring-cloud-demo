# spring cloud 练习
## 1、项目简介
### jdk: 1.8
* 父项目是spring-cloud-demo，引入了spring boot (2.1.2)以及spring cloud (Greenwich.RELEASE)
* cloud-eureka-7001 是注册中心，端口号7001
* cloud-provider-8001 是服务提供者，端口号为8001
* cloud-provider-8002 是服务提供者， 端口号为8002  （8001/8001两个服务id均为eureka-client，用来模拟负载均衡）
* cloud-provider-8005 是服务提供者， 端口号为8005   (该服务id为eureka-client5，用来模拟zuul服务网关)
* cloud-consumer-9001 是服务消费者 （hystrix熔断处理在消费者配置）
* cloud-zuul-6001 是zuul服务网关，端口号为6001

## 2、相关模块jar说明：
* 2.1、spring boot 2.0之后，feign负载均衡相关jar包变成了：
                <dependency>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-openfeign</artifactId>
                </dependency>

* 2.2、spring boot2.0之后，hystrix熔断处理，服务降级相关jar包变成了：
                <dependency>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
                </dependency>
                
## 3、笔记：
* 3.1、hystrix熔断处理，直接在消费者调用控制器controller相关方法上使用@HystrixCommand()注解进行配置，
    如果接口使用了Feign负载均衡策略，则可以在接口上的@FeignClient()注解的属性中进行配置，即写一个FallBack类


