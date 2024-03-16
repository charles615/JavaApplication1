package com.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecommerce.common.utils.PageUtils;
import com.ecommerce.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Yiru
 * @email 22453341liu@gmail.com
 * @date 2024-03-12 21:03:11
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

