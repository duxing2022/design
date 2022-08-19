package com.demo.design.fAdapter.adaptee;

import cn.hutool.json.JSONUtil;
import lombok.Data;

/**
 * 订单mq
 *
 * @author shenghua.song
 * @date 2022/08/19
 */
@Data
public class OrderMq {

    /**
     * 用户ID
     */
    private String uid;
    /**
     * sku
     */
    private String sku;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 下单时间
     */
    private String createOrderTime;

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}
