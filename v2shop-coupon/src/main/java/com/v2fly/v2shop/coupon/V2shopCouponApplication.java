package com.v2fly.v2shop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.v2fly.v2shop.coupon.dao")
@SpringBootApplication
public class V2shopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopCouponApplication.class, args);
    }

}
