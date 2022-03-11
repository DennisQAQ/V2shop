package com.v2fly.v2shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Dennis wang
 * @email deardenniswang@Gmail.com
 * @date 2022-03-11 21:44:08
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

