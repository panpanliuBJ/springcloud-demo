package com.finley.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Need class description here...
 *
 * @Author: liupanpan
 * @Date: 2019/1/21
 * @Copyright (c) 2013, bitmain.com All Rights Reserved
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String getHello() {
        return restTemplate.getForObject("http://SERVICE-EUREKA-CLIENT/", String.class);
    }

}
