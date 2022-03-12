package com.v2fly.v2shop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.v2fly.v2shop.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class V2shopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopCouponApplication.class, args);
    }

}
