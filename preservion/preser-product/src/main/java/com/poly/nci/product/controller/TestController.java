package com.poly.nci.product.controller;


import com.poly.nci.product.feign.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
//    @Autowired
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private CustomerClient customerClient;

//    @RequestMapping("/test")
//    public String test(){
//        return restTemplate.getForObject("http://preser-customer/test",String.class);
//    }

    @RequestMapping("/test1")
    public String test1(){
        return customerClient.test();
    }

}
