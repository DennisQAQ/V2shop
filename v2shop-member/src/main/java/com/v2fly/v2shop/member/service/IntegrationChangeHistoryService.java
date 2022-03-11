package com.v2fly.v2shop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Dennis wang
 * @email DearDennisWang@gmail.com
 * @date 2022-03-11 11:18:55
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

