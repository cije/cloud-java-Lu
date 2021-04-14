package com.ce.cloudgateway.filter;

import com.google.common.net.HttpHeaders;
import io.netty.util.internal.ObjectUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

/**
 * @author c__e
 * @date 2021/4/14 10:15
 */
@Component
public class CustomerGateWayFilter implements GlobalFilter, Ordered {
    private static final String AUTHTOKEN = "cije";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        List<String> authToken = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION);
        if (ObjectUtils.isEmpty(authToken) || !Objects.equals(authToken.get(0), AUTHTOKEN)) {
            // 拦截
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        // 放行
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
