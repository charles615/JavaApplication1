package com.ecommerce.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ecommerce.product.entity.BrandEntity;
import com.ecommerce.product.service.BrandService;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EcommerceProductApplication.class)
public class EcommerceProductApplicationTests {

    @Resource
    private BrandService brandService;


    @Test
    public void test1() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("a");
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        System.out.println("Done......");

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("NEW");
//        brandService.updateById(brandEntity);

       List<BrandEntity> l =  brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
       l.forEach((item) -> {
           System.out.println(item);
       });
    }


}
