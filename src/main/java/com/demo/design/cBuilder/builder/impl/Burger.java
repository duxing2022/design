package com.demo.design.cBuilder.builder.impl;

import com.demo.design.cBuilder.builder.Item;
import com.demo.design.cBuilder.product.Packing;
import com.demo.design.cBuilder.product.impl.Wrapper;

/**
 * 汉堡
 *
 * @author Administrator
 * @date 2022/08/17
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 价格
     *
     * @return float
     */
    @Override
    public abstract float price();
}
