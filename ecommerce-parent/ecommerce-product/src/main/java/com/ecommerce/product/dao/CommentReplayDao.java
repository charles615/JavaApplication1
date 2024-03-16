package com.ecommerce.product.dao;

import com.ecommerce.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author Yiru
 * @email 22453341liu@gmail.com
 * @date 2024-03-12 21:03:11
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
