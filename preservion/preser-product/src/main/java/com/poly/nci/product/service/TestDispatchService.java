package com.poly.nci.product.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface TestDispatchService {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();
}
