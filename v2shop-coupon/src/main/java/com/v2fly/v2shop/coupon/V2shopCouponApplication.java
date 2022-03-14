package com.v2fly.v2shop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@MapperScan("com.v2fly.v2shop.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication

public class V2shopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopCouponApplication.class, args);
    }

}
