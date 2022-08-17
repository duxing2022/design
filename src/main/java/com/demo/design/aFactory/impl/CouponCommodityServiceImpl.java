package com.demo.design.aFactory.impl;

import cn.hutool.json.JSONUtil;
import com.demo.design.aFactory.CommodityService;
import com.demo.design.aFactory.coupon.CouponResult;
import com.demo.design.aFactory.coupon.CouponService;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * 优惠劵商品服务
 *
 * @author shenghua.song
 * @date 2022/08/16
 */

@Slf4j
public class CouponCommodityServiceImpl implements CommodityService {

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        log.info("请求参数【优惠券】=>uId:{} commodityId:{} bizId:{} extMap:{}", uId, commodityId, bizId, extMap);
        log.info("测试结果【优惠券】:{}", JSONUtil.toJsonStr(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
