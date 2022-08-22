package com.demo.design.iCombination.component;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 组成部分
 *
 * @author shenghua.song
 * @date 2022/08/22
 */

@Data
@AllArgsConstructor
public abstract class Component {

    protected String name;

    /**
     * 添加
     *
     * @param component 组成部分
     */
    public abstract void add(Component component);

    /**
     * 去除
     *
     * @param component 组成部分
     */
    public abstract void remove(Component component);

    /**
     * 陈列
     *
     * @param deep 深
     */
    public abstract void display(int deep);
}
