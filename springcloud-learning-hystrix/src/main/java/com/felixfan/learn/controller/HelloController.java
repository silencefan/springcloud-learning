package com.felixfan.learn.controller;

import com.felixfan.learn.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: felix.fan
 * @date: 2019/2/14 16:14
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return helloService.helloService(name);
    }
}