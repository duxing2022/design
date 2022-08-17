package com.demo.design.cBuilder.concreteBuilder;

import com.demo.design.cBuilder.builder.impl.Burger;

/**
 * 鸡肉汉堡
 *
 * @author Administrator
 * @date 2022/08/17
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}