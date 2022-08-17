package com.demo.design.aFactory.goods;

import lombok.Builder;
import lombok.Data;

/**
 * 交付请求
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
@Data
@Builder
public class DeliverReq {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * sku
     */
    private String sku;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 收货人用户名
     */
    private String consigneeUserName;

    /**
     * 收货人用户电话
     */
    private String consigneeUserPhone;

    /**
     * 收货人用户地址
     */
    private String consigneeUserAddress;


}
