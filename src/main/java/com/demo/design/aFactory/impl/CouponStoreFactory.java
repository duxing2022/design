package com.demo.design.aFactory.impl;

import com.demo.design.aFactory.CommodityService;
import com.demo.design.aFactory.StoreFactory;

/**
 * 优惠劵工厂
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
public class CouponStoreFactory implements StoreFactory {

    @Override
    public CommodityService getCommodityService() {
        return new CouponCommodityServiceImpl();
    }
}
