package com.demo.design.aFactory.product.impl;

import cn.hutool.json.JSONUtil;
import com.demo.design.aFactory.product.CommodityService;
import com.demo.design.aFactory.goods.DeliverReq;
import com.demo.design.aFactory.goods.GoodsService;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * 实物商品服务
 *
 * @author shenghua.song
 * @date 2022/08/16
 */
@Slf4j
public class GoodsCommodityServiceImpl implements CommodityService {

    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq =
                DeliverReq.builder()
                        .userName("Tom")
                        .userPhone("18869858965")
                        .sku(commodityId)
                        .orderId(bizId)
                        .consigneeUserName(extMap.get("consigneeUserName"))
                        .consigneeUserPhone(extMap.get("consigneeUserPhone"))
                        .consigneeUserAddress(extMap.get("consigneeUserAddress"))
                        .build();
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap： {} ", uId, commodityId, bizId, JSONUtil.toJsonStr(extMap));
        log.info("测试结果[优惠券]：{}", isSuccess);
        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }
}
