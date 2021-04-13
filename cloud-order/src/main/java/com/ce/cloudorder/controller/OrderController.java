package com.ce.cloudorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author c__e
 * @date 2021/4/8 15:51
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/getOrderInfo")
    public String getOrderInfo() {
        String url = "http://localhost:8801/product/getProductById/1";
        String msg = restTemplate.getForObject(url, String.class);
        return "查询订单成功，" + msg;
    }
}
