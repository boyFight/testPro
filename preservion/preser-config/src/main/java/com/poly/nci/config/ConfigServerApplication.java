package com.poly.nci.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置服务
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/15
 * @project preser-config
 * @package cn.com.poly.nci.config
 * @class ConfigServerApplication.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
