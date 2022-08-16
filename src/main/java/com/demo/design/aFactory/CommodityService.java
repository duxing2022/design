package com.demo.design.aFactory;

import java.util.Map;

/**
 * 商品
 *
 * @author shenghua.song
 * @date 2022/08/16
 */
public interface CommodityService {

    /**
     * 发送商品
     *
     * @param uId uId
     * @param commodityId 商品id
     * @param bizId 身份证件
     * @param extMap extMap
     * @throws Exception 异常
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
