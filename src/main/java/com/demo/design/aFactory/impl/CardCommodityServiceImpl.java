package com.demo.design.aFactory.impl;

import cn.hutool.json.JSONUtil;
import com.demo.design.aFactory.CommodityService;
import com.demo.design.aFactory.card.IQiYiCardService;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * 第三方兑换卡商品服务
 *
 * @author shenghua.song
 * @date 2022/08/16
 */

@Slf4j
public class CardCommodityServiceImpl implements CommodityService {

    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        log.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId： {} extMap：{}", uId, commodityId, bizId, JSONUtil.toJsonStr(extMap));
        log.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
