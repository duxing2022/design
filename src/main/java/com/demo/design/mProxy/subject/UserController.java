package com.demo.design.mProxy.subject;

/**
 * 用户控制器
 *
 * @author shenghua.song
 * @date 2022/08/26
 */
public interface UserController {

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return {@link String}
     */
    String login(String username, String password);

    /**
     * 登记
     *
     * @param username 用户名
     * @param password 密码
     * @return {@link String}
     */
    String register(String username, String password);
}

