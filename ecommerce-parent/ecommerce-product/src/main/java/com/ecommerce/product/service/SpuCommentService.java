package com.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecommerce.common.utils.PageUtils;
import com.ecommerce.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author Yiru
 * @email 22453341liu@gmail.com
 * @date 2024-03-12 21:03:11
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

