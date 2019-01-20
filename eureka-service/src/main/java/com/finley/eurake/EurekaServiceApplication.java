package com.finley.eurake;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Need class description here...
 *
 * @Author: liupanpan
 * @Date: 2019/1/20
 * @Copyright (c) 2013, bitmain.com All Rights Reserved
 */



@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }

}
