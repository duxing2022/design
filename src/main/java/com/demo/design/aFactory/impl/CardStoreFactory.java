package com.demo.design.aFactory.impl;

import com.demo.design.aFactory.CommodityService;
import com.demo.design.aFactory.StoreFactory;

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
