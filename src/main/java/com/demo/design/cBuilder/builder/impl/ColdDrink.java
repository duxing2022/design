package com.demo.design.cBuilder.builder.impl;

import com.demo.design.cBuilder.builder.Item;
import com.demo.design.cBuilder.product.impl.Bottle;
import com.demo.design.cBuilder.product.Packing;

/**
 * 冷饮
 *
 * @author Administrator
 * @date 2022/08/17
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 价格
     *
     * @return float
     */
    @Override
    public abstract float price();
}