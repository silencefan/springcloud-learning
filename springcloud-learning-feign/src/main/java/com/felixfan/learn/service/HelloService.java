package com.felixfan.learn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: felix.fan
 * @date: 2019/2/14 16:47
 */
@FeignClient(value = "eureka-client")
public interface HelloService {

    @GetMapping(value = "/hi")
    String sayHello(@RequestParam(value = "name") String name);
}