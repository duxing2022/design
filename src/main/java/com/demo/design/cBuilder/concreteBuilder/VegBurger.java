package com.demo.design.cBuilder.concreteBuilder;

import com.demo.design.cBuilder.builder.impl.Burger;

/**
 * 素食汉堡
 *
 * @author Administrator
 * @date 2022/08/17
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}