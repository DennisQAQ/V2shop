package com.v2fly.v2shop.coupon.dao;

import com.v2fly.v2shop.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author Dennis Wang
 * @email deardenniswang@gmail.com
 * @date 2022-03-11 22:28:11
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
