package com.demo.design.fAdapter.adapter;

import cn.hutool.json.JSONUtil;
import com.demo.design.fAdapter.RebateInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * MQ消息体适配类
 *
 * @author shenghua.song
 * @date 2022/08/18
 */
public class MqAdapter {

    public static RebateInfo filter(String strJson, Map<String, String> link)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSONUtil.toBean(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }
}
