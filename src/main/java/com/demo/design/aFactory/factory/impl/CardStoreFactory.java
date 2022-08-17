package com.demo.design.aFactory.factory.impl;

import com.demo.design.aFactory.product.CommodityService;
import com.demo.design.aFactory.factory.StoreFactory;
import com.demo.design.aFactory.product.impl.CardCommodityServiceImpl;

/**
 * 第三方兑换卡工厂
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
public class CardStoreFactory implements StoreFactory {

    @Override
    public CommodityService getCommodityService() {
        return new CardCommodityServiceImpl();
    }
}
