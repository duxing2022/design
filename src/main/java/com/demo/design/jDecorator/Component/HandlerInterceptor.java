package com.demo.design.jDecorator.Component;

/**
 * 处理拦截
 *
 * @author shenghua.song
 * @date 2022/08/23
 */
public interface HandlerInterceptor {

    /**
     * 预处理
     *
     * @param request request
     * @param response response
     * @param handler 处理程序
     * @return boolean
     */
    boolean preHandle(String request, String response, Object handler);
}
