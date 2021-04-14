package com.ce.clouduser8804.feign.impl;

import com.ce.clouduser8804.feign.ProductFeignService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author c__e
 * @date 2021/4/14 9:24
 */
@Service
public class ProductFeignServiceImpl implements ProductFeignService {
    @Override
    public String getProductById(Integer id) {
        return "商品服务失败：" + id;
    }

    @Override
    public String getProductByMap(Map<String, Object> map) {
        return "商品服务失败：" + map;
    }
}
