package com.v2fly.v2shop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.v2fly.v2shop.ware.dao")
@SpringBootApplication
public class V2shopWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopWareApplication.class, args);
    }

}
