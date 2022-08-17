package com.demo.design.aFactory.card;

import lombok.extern.slf4j.Slf4j;

/**
 * 模拟爱奇艺会员卡服务
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
@Slf4j
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        log.info("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}
