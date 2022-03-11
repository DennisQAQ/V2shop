package com.v2fly.v2shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author Dennis wang
 * @email deardenniswang@Gmail.com
 * @date 2022-03-11 21:44:09
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

