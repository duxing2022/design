package com.demo.design.mProxy.proxy;

import com.demo.design.mProxy.realSubject.UserControllerImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * 用户控制器代理
 *
 * @author shenghua.song
 * @date 2022/08/26
 */
@Slf4j
public class UserControllerProxy extends UserControllerImpl {

    private UserControllerImpl userController;

    public UserControllerProxy(UserControllerImpl userController) {
        this.userController = userController;
    }

    @Override
    public String login(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 登录逻辑
        userController.login("username", "password");
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        log.info("接口响应时间：" + responseTime);
        return null;
    }

    @Override
    public String register(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 登录逻辑
        userController.login("username", "password");
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        log.info("接口响应时间：" + responseTime);
        return null;
    }
}
