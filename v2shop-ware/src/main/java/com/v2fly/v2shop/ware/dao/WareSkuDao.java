package com.v2fly.v2shop.ware.dao;

import com.v2fly.v2shop.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Dennis wang
 * @email DearDennisWang@gmail.com
 * @date 2022-03-11 11:20:27
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
