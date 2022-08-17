package com.demo.design.cBuilder.product.impl;

import com.demo.design.cBuilder.product.Packing;

/**
 * 瓶子包装
 *
 * @author Administrator
 * @date 2022/08/17
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}