package com.demo.design.jDecorator.Decorator;

import com.demo.design.jDecorator.Component.HandlerInterceptor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * sso装饰器
 *
 * @author shenghua.song
 * @date 2022/08/23
 */

@AllArgsConstructor
@NoArgsConstructor
public abstract class SsoDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
