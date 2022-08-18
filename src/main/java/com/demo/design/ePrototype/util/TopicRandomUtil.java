package com.demo.design.ePrototype.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 主题随机util
 *
 * @author shenghua.song
 * @date 2022/08/18
 */
public class TopicRandomUtil {

    /**
     * 随机
     *
     * @param option 选项
     * @param key 答案
     * @return {@link Topic}
     */
    public static Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<>(16);
        int idx = 0;
        String keyNew = "";

        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }

}
