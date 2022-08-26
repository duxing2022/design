package com.demo.design.mProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lombok.extern.slf4j.Slf4j;

/**
 * 动态代理处理程序
 *
 * @author shenghua.song
 * @date 2022/08/26
 */

@Slf4j
public class DynamicProxyHandler implements InvocationHandler {

    private Object target;

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(this.target, args);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间：" + responseTime);
        return result;
    }
}
