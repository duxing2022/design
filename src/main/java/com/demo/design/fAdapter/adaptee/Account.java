package com.demo.design.fAdapter.adaptee;

import cn.hutool.json.JSONUtil;
import lombok.Data;

/**
 * 账户
 *
 * @author shenghua.song
 * @date 2022/08/19
 */

@Data
public class Account {

    /**
     * 开户编号
     */
    private String number;
    /**
     * 开户地
     */
    private String address;
    /**
     * 开户时间
     */
    private String accountDate;
    /**
     * 开户描述
     */
    private String desc;

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}
