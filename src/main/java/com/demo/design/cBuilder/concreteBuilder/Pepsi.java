package com.demo.design.cBuilder.concreteBuilder;

import com.demo.design.cBuilder.builder.impl.ColdDrink;

/**
 * 百事可乐
 *
 * @author Administrator
 * @date 2022/08/17
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
