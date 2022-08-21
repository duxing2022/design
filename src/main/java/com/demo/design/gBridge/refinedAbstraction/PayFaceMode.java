package com.demo.design.gBridge.refinedAbstraction;

import com.demo.design.gBridge.implementor.IPayMode;
import lombok.extern.slf4j.Slf4j;

/**
 * 支付面模式
 *
 * @author Administrator
 * @date 2022/08/21
 */

@Slf4j
public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        log.info("⼈脸⽀付，⻛控校验脸部识别");
        return true;
    }
}
