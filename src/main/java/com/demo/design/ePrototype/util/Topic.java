package com.demo.design.ePrototype.util;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 话题
 *
 * @author shenghua.song
 * @date 2022/08/18
 */

@AllArgsConstructor
@Data
public class Topic {

    /**
     * 选项
     */
    private Map<String, String> option;

    /**
     * 答案
     */
    private String key;
}
