package com.poly.nci.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册与发现服务
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/15
 * @project preser-euraka
 * @package cn.com.poly.nci.customer
 * @class EurekaServerApplication.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
