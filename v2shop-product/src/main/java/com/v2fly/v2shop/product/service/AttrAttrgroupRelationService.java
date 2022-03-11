package com.v2fly.v2shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author Dennis wang
 * @email deardenniswang@Gmail.com
 * @date 2022-03-11 21:44:13
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

