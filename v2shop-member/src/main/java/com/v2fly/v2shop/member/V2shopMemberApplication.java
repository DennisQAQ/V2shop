package com.v2fly.v2shop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.v2fly.v2shop.member.dao")
@SpringBootApplication
public class V2shopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopMemberApplication.class, args);
    }

}
