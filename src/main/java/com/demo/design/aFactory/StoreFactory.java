package com.demo.design.aFactory;

import com.demo.design.aFactory.impl.CardCommodityServiceImpl;
import com.demo.design.aFactory.impl.CoupCommodityServiceImpl;
import com.demo.design.aFactory.impl.GoodsCommodityServiceImpl;

/**
 * 商店工厂
 *
 * @author shenghua.song
 * @date 2022/08/16
 */
public class StoreFactory {

    public CommodityService getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }

        if (1 == commodityType) {
            return new CoupCommodityServiceImpl();
        }
        if (2 == commodityType) {
            return new GoodsCommodityServiceImpl();
        }
        if (3 == commodityType) {
            return new CardCommodityServiceImpl();
        }
        throw new RuntimeException("不存在的商品类型");
    }
}
