package com.poly.nci.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
/**
 * 客户服务
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/16
 * @project preser-zuul
 * @package cn.com.poly.nci.zuul
 * @class ZuulApplication.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@SpringCloudApplication
@EnableHystrix
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
