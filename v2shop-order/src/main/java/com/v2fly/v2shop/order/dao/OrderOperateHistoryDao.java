package com.v2fly.v2shop.order.dao;

import com.v2fly.v2shop.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author Dennis wang
 * @email DearDennisWang@gmail.com
 * @date 2022-03-11 11:04:17
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
