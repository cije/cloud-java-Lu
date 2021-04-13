package com.ce.clouduser8804.constroller;

import com.ce.clouduser8804.feign.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author c__e
 * @date 2021/4/13 16:35
 */
@RestController
public class UserController {

    @Autowired
    private ProductFeignService productFeignService;

    @GetMapping("/user/getProduct")
    public String getProduct() {
        /*
        通过Feign接口调用商品服务
        1. 装配feign接口
        2. 调用接口的方法 完成远程调用
         */
        return productFeignService.getProductById(1);
    }

    @GetMapping("/user/getProductMap")
    public String getProductMap() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("lala", "拉啊啦啦");
        map.put("ad", 123);
        return productFeignService.getProductByMap(map);
    }
}
