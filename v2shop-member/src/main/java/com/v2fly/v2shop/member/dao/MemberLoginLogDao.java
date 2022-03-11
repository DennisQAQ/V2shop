package com.v2fly.v2shop.member.dao;

import com.v2fly.v2shop.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author Dennis wang
 * @email DearDennisWang@gmail.com
 * @date 2022-03-11 11:18:52
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
