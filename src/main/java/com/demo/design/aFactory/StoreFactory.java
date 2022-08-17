package com.demo.design.aFactory;

/**
 * 商店工厂
 *
 * @author shenghua.song
 * @date 2022/08/16
 */
public interface StoreFactory {

    /**
     * 获取商品服务
     *
     * @return {@link CommodityService}
     */
    CommodityService getCommodityService();
}
