package com.demo.design.jDecorator.ConcreteComponent;

import com.demo.design.jDecorator.Component.HandlerInterceptor;

/**
 * sso拦截器
 *
 * @author shenghua.song
 * @date 2022/08/23
 */
public class SsoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(String request, String response, Object handler) {
// 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        return ticket.equals("success");
    }
}
