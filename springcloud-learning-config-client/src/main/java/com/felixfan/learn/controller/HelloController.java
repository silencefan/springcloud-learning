package com.felixfan.learn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author felix.fan
 * @date 2019/2/23 23:30
 */
@RestController
@RefreshScope
@Slf4j
public class HelloController {

    @Value("${env}")
    private String env;

    @GetMapping(value = "hello")
    public String hello() {
        log.info("------------env: [{}]" , env);
        return env;
    }
}