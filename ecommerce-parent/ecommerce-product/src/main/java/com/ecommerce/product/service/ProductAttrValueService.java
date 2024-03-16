package com.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecommerce.common.utils.PageUtils;
import com.ecommerce.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author Yiru
 * @email 22453341liu@gmail.com
 * @date 2024-03-12 21:03:11
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

