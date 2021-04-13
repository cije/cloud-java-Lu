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

    /**
     * Ribbon负载均衡实现的流程
     * <ol>
     * <li>RestTemplate发送的请求是服务名称http://nacos-product/product/getProductById/1</li>
     * <li>因为RestTemplate上加了 注解@LoadBalanced</li>
     * <li>所以Ribbon会拦截 RestTemplate发送的请求</li>
     * <li>根据url中的服务名称 以及自身的负载均衡策略 去订单服务的服务列表中找到一个要调用的ip+端口号 localhost:8802</li>
     * <li>然后修改url为 http://localhost:8802/product/getProductById/1</li>
     * <li>将新的请求再次发送</li>
     * </ol>
     */
    @GetMapping("/order/getOrderInfo")
    public String getOrderInfo() {
        String url = "http://nacos-product/product/getProductById/1";
        String msg = restTemplate.getForObject(url, String.class);
        return "查询订单成功，" + msg;
    }
}
