package com.felixfan.learn.service;

import org.springframework.stereotype.Component;

/**
 * @author felix.fan
 * @date 2019/2/14 23:51
 * @description Feign启用断路器功能，service接口声明一个fallback的类，用于服务不可用时调用fallback的类
 */
@Component
public class HystrixForFeign implements HelloService {

    @Override
    public String sayHello(String name) {
        return "sorry " + name;
    }
}