package com.poly.nci.product;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * 客户服务
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/15
 * @project preser-produft
 * @package cn.com.poly.nci.product
 * @class ProductApplication.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@EnableFeignClients
@ComponentScan(basePackages = { "com.*" })
@SpringCloudApplication
@EnableEurekaClient
@EnableHystrix
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

    //开启客户端负载均衡
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
