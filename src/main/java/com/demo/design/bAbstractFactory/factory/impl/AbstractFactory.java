package com.demo.design.bAbstractFactory.factory.impl;


import com.demo.design.bAbstractFactory.product.Color;
import com.demo.design.bAbstractFactory.product.Shape;

/**
 * 抽象工厂
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
public abstract class AbstractFactory {

    /**
     * 染上颜色
     *
     * @param color 颜色
     * @return {@link Color}
     */
    public abstract Color getColor(String color);

    /**
     * 塑形
     *
     * @param shape 形状
     * @return {@link Shape}
     */
    public abstract Shape getShape(String shape);
}
