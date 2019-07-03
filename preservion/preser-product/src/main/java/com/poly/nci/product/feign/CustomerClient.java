package com.poly.nci.product.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 客户服务
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/16
 * @project
 * @package cn.com.poly.nci.product.feign
 * @class CustomerClient.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@FeignClient(name = "preser-customer", fallbackFactory = ErrorFallbackFactory.class)
public interface CustomerClient {

    /**
     * 测试
     *
     * @param
     * @return
     */
    @PostMapping("test")
    String test();

}

/**
 * 回调
 *
 * @author hucy
 * @version [版本号]
 * @date 2019/4/16
 * @project
 * @package cn.com.poly.nci.product.feign
 * @class ErrorFallbackFactory.java
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Component
@Slf4j
class ErrorFallbackFactory implements FallbackFactory<CustomerClient> {
//    public String fallbackMehtod(Throwable throwable){
//        log.info("error msg = {}",throwable.getMessage());
//        return "请求超时";
//    }

//    @Override
//    public CustomerClient create(Throwable throwable) {
//        return new CustomerClient(){
//            @Override
//            public String test() {
//                return fallbackMehtod(throwable);
//            }
//        };
//    }

    @Override
    public CustomerClient create(Throwable throwable) {
        return () -> {
            log.info("error msg = {}", throwable.getMessage());
            return "请求超时";
        };
    }
}