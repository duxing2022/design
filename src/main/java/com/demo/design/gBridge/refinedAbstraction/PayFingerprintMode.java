package com.demo.design.gBridge.refinedAbstraction;

import com.demo.design.gBridge.implementor.IPayMode;
import lombok.extern.slf4j.Slf4j;

/**
 * 支付指纹模式
 *
 * @author Administrator
 * @date 2022/08/21
 */
@Slf4j
public class PayFingerprintMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        log.info("指纹⽀付，⻛控校验指纹信息");
        return true;
    }
}
