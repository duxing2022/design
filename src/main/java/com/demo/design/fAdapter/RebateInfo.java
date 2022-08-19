package com.demo.design.fAdapter;

import lombok.Data;

/**
 * 返利信息
 *
 * @author shenghua.song
 * @date 2022/08/18
 */
@Data
public class RebateInfo {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 身份证件
     */
    private String bizId;

    /**
     * 业务时间
     */
    private String bizTime;

    /**
     * 业务描述
     */
    private String desc;
}
