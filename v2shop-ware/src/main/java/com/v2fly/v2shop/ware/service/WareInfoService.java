package com.v2fly.v2shop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Dennis wang
 * @email DearDennisWang@gmail.com
 * @date 2022-03-11 11:20:29
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

