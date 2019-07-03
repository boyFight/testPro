package com.poly.nci.customer.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class TestController {
    @Value("${name}")
    private String type;

//    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/test")
    public String test(){
        log.info("进入到测试方法！");
        return "当前环境："+type;
    }

    @RequestMapping("/test1")
    public String test1(){
        return restTemplate.getForObject("",String.class);
    }

}
