package com.v2fly.v2shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Dennis wang
 * @email deardenniswang@Gmail.com
 * @date 2022-03-11 21:44:11
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

