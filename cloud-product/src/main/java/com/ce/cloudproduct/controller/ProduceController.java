package com.ce.cloudproduct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author c__e
 * @date 2021/4/8 15:48
 */
@RestController
@RequestMapping("/product")
public class ProduceController {
    /**
     * 端口
     */
    @Value("${server.port}")
    private String port;

    @GetMapping("/getProductById/{id}")
    public String getProductById(@PathVariable("id") Integer id) {
        return "查询到商品，id为：" + id + "，商品服务端口号为：" + port;
    }

    @PostMapping("/getProductByMap")
    public String getProductByMap(@RequestBody Map<String, Object> map) {
        return "接收到map数据为：" + map + " 商品服务端口为：" + port;
    }
}
