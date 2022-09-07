package com.demo.design.gBridge.abstraction;

import com.demo.design.gBridge.implementor.IPayMode;
import java.math.BigDecimal;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 支付
 *
 * @author Administrator
 * @date 2022/08/21
 */

@Slf4j
@Data
public abstract class Pay {

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 划账接⼝
     *
     * @param uId     uid
     * @param tradeId 交易id
     * @param amount  数量
     * @return {@link String}
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
