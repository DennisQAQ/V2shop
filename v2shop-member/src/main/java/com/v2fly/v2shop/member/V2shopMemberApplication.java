package com.v2fly.v2shop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.v2fly.v2shop.member.dao")
@EnableFeignClients("com.v2fly.v2shop.member.feign")
@SpringBootApplication

public class V2shopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopMemberApplication.class, args);
    }

}
