package com.v2fly.v2shop.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.v2fly.v2shop.order.dao")
@SpringBootApplication
public class V2shopOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopOrderApplication.class, args);
    }

}
