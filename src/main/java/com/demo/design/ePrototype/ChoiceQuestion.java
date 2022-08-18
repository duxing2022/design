package com.demo.design.ePrototype;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 选择题
 *
 * @author shenghua.song
 * @date 2022/08/18
 */

@Data
@AllArgsConstructor
public class ChoiceQuestion {

    /**
     * 名称
     */
    private String name;


    /**
     * 选项
     */
    private Map<String, String> option;

    /**
     * 答案
     */
    private String key;
}
