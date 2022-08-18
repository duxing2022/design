package com.demo.design.ePrototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 问答题
 *
 * @author shenghua.song
 * @date 2022/08/18
 */

@Data
@AllArgsConstructor
public class AnswerQuestion {

    /**
     * 名称
     */
    private String name;

    /**
     * 答案
     */
    private String key;
}
