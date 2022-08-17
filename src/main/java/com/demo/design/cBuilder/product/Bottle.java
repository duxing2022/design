package com.demo.design.cBuilder.product;

/**
 * 瓶子
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