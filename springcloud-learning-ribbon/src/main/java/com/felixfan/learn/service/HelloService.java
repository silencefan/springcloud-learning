package com.felixfan.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: felix.fan
 * @date: 2019/2/14 16:09
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }
}