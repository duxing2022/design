package com.demo.design.aFactory.factory.impl;

import com.demo.design.aFactory.product.CommodityService;
import com.demo.design.aFactory.factory.StoreFactory;
import com.demo.design.aFactory.product.impl.CouponCommodityServiceImpl;

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
