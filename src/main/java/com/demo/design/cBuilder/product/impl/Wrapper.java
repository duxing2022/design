package com.demo.design.cBuilder.product.impl;

import com.demo.design.cBuilder.product.Packing;

/**
 * 包装纸
 *
 * @author Administrator
 * @date 2022/08/17
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
