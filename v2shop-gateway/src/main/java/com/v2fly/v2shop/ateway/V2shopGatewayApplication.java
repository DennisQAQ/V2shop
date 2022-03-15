package com.v2fly.v2shop.ateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class V2shopGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(V2shopGatewayApplication.class, args);
    }

}
