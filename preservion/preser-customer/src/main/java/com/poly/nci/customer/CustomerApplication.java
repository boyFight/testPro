package com.poly.nci.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 客户服务
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/15
 * @project preser-customer
 * @package cn.com.poly.nci.customer
 * @class CustomerApplication.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@EnableFeignClients
@ComponentScan(basePackages = { "com.*" })
@SpringCloudApplication
@EnableEurekaClient
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
