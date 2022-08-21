package com.demo.design.gBridge.concreteImplementor;

import com.demo.design.gBridge.abstraction.Pay;
import com.demo.design.gBridge.implementor.IPayMode;
import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;

/**
 * zfb支付
 *
 * @author Administrator
 * @date 2022/08/21
 */

@Slf4j
public class ZfbPay extends Pay {

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        log.info("模拟⽀付宝渠道⽀付划账开始。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        log.info("模拟⽀付宝渠道⽀付⻛控校验。uId：{} tradeId：{} security： {}", uId, tradeId, security);
        if (!security) {
            log.info("模拟⽀付宝渠道⽀付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        log.info("模拟⽀付宝渠道⽀付划账成功。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
        return "0000";
    }
}
