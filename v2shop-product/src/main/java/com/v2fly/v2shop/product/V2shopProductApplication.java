package com.v2fly.v2shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.v2fly.v2shop.product.dao")
@SpringBootApplication
public class V2shopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopProductApplication.class, args);
    }

}
