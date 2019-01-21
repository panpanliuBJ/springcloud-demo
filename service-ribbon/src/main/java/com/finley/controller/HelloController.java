package com.finley.controller;

import com.finley.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Need class description here...
 *
 * @Author: liupanpan
 * @Date: 2019/1/21
 * @Copyright (c) 2013, bitmain.com All Rights Reserved
 */

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public String hello() {
        return helloService.getHello();
    }

}
