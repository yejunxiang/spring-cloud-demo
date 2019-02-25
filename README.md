# spring cloud 练习
## 项目简介
### jdk: 1.8
* 父项目是spring-cloud-demo，引入了spring boot (2.1.2)以及spring cloud (Greenwich.RELEASE)
* cloud-eureka-7001 是注册中心，端口号7001
* cloud-provider-8001 是服务提供者，端口号为8001
* cloud-provider-8002 是服务提供者， 端口号为8002  （两个服务提供者，用来模拟负载均衡）
* cloud-consumer-9001 是服务消费者

### 相关模块jar说明：
* spring boot 2.0之后，feign负载均衡相关jar包变成了：
                <dependency>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-openfeign</artifactId>
                </dependency>

* spring boot2.0之后，hystrix熔断处理，服务降级相关jar包变成了：
                <dependency>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
                </dependency>


