package com.demo.design.gBridge.refinedAbstraction;

import com.demo.design.gBridge.implementor.IPayMode;
import lombok.extern.slf4j.Slf4j;

/**
 * 支付密码
 *
 * @author Administrator
 * @date 2022/08/21
 */
@Slf4j
public class PayCypher implements IPayMode {

    @Override
    public boolean security(String uId) {
        log.info("密码⽀付，⻛控校验环境安全");
        return true;
    }
}
