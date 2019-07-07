package com.yuntian.cousumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CousumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CousumerApplication.class, args);
    }

}
