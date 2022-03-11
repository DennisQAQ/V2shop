package com.v2fly.v2shop.product;

import com.v2fly.v2shop.product.entity.BrandEntity;
import com.v2fly.v2shop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V2shopProductApplicationTests {

    @Autowired
    BrandService BrandService;


    @Test
    void contextLoads() {
        BrandEntity BrandEntity = new BrandEntity();
        BrandEntity.setDescript("永远的神");
        BrandEntity.setName("Apple");
        BrandService.save(BrandEntity);

        System.out.println("保存成功！！！");
    }

}
