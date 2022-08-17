package com.demo.design.aFactory.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 优惠券结果
 *
 * @author shenghua.song
 * @date 2022/08/17
 */

@AllArgsConstructor
@Data
public class CouponResult {

    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;
}
