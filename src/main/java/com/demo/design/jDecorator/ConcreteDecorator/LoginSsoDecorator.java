package com.demo.design.jDecorator.ConcreteDecorator;

import com.demo.design.jDecorator.Component.HandlerInterceptor;
import com.demo.design.jDecorator.Decorator.SsoDecorator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.extern.slf4j.Slf4j;

/**
 * 登录sso装饰器
 *
 * @author shenghua.song
 * @date 2022/08/23
 */

@Slf4j
public class LoginSsoDecorator extends SsoDecorator {

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("duoduo", "queryUserInfo");
    }

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success) {
            return false;
        }
        String userId = request.substring(8);
        String method = authMap.get(userId);
        log.info("模拟单点登录⽅法访问拦截校验：{} {}", userId, method);
        // 模拟⽅法校验
        return "queryUserInfo".equals(method);
    }

}
