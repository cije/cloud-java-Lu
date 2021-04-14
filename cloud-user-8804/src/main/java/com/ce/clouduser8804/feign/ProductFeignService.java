package com.ce.clouduser8804.feign;

import com.ce.clouduser8804.feign.impl.ProductFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * 用于调用商品服务的接口
 * `@FeignClient` 注解声明当前接口位Feign的客户端 当前接口就具备了服务调用的能力<br/>
 * 参数value为 被调用的服务名称
 *
 * @author c__e
 * @date 2021/4/13 16:28
 */
@FeignClient(value = "nacos-product", qualifier = "productFeignService", fallback = ProductFeignServiceImpl.class)
public interface ProductFeignService {
    /**
     * 调用商品服务的getProductById<br/>
     * 方法名 无要求<br/>
     * 参数和返回值 需要和被调用接口保持一致<br/>
     * 通过@RequestMapping @GetMapping等声明被调用接口的地址
     */
    @GetMapping("/product/getProductById/{id}")
    String getProductById(@PathVariable("id") Integer id);

    @GetMapping("/product/getProductByMap")
    String getProductByMap(Map<String, Object> map);
}
