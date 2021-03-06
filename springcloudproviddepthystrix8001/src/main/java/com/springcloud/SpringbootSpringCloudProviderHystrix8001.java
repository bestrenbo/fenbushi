package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker //添加对熔断的支持
public class SpringbootSpringCloudProviderHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpringCloudProviderHystrix8001.class,args);
    }
}
