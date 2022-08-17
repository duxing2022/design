package com.demo.design.aFactory.goods;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 模拟实物商品服务
 *
 * @author shenghua.song
 * @date 2022/08/17
 */

@Slf4j
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        log.info("模拟发货实物商品一个：" + JSONUtil.toJsonStr(req));
        return true;
    }

}
