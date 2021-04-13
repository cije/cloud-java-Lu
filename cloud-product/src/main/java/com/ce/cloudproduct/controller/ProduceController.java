package com.ce.cloudproduct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author c__e
 * @date 2021/4/8 15:48
 */
@RestController
public class ProduceController {
    /**
     * 端口
     */
    @Value("${server.port}")
    private String port;

    @GetMapping("/product/getProductById/{id}")
    public String getProductById(@PathVariable("id") Integer id) {
        return "查询到商品，id为：" + id + "，商品服务端口号为：" + port;
    }
}
