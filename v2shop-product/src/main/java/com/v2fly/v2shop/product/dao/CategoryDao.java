package com.v2fly.v2shop.product.dao;

import com.v2fly.v2shop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Dennis wang
 * @email deardenniswang@Gmail.com
 * @date 2022-03-11 21:44:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
