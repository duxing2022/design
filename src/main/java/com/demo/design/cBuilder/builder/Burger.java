package com.demo.design.cBuilder.builder;

import com.demo.design.cBuilder.product.Item;
import com.demo.design.cBuilder.product.Packing;
import com.demo.design.cBuilder.product.Wrapper;

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
