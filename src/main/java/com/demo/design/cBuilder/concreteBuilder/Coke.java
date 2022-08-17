package com.demo.design.cBuilder.concreteBuilder;

import com.demo.design.cBuilder.builder.impl.ColdDrink;

/**
 * 可口可乐
 *
 * @author Administrator
 * @date 2022/08/17
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}