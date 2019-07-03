package com.poly.nci.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
/**
 * 配置服务
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/16
 * @project preser-admin
 * @package cn.com.poly.nci.admin
 * @class SpringBootAdminApplication.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringCloudApplication
public class SpringBootAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminApplication.class, args);
	}

}
