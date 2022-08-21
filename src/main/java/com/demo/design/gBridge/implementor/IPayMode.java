package com.demo.design.gBridge.implementor;

/**
 * 支付接口
 *
 * @author Administrator
 * @date 2022/08/21
 */
public interface IPayMode {

    /**
     * 安全
     *
     * @param uId u id
     * @return boolean
     */
    boolean security(String uId);
}
