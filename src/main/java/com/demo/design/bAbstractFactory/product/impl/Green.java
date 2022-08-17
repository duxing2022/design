package com.demo.design.bAbstractFactory.product.impl;


import com.demo.design.bAbstractFactory.product.Color;
import lombok.extern.slf4j.Slf4j;

/**
 * 绿色
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
@Slf4j
public class Green implements Color {

    @Override
    public void fill() {
        log.info("fill{}", "绿色");
    }
}
