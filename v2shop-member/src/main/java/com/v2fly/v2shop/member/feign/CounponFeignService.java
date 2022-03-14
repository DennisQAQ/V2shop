package com.v2fly.v2shop.member.feign;

import com.v2fly.v2shop.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("v2shop-coupon")//和注册中心的应用名称一致
public interface CounponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R MembersCoupon();

}
