package com.demo.design.bAbstractFactory.impl;

import com.demo.design.bAbstractFactory.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * 长方形
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
@Slf4j
public class Rectangle implements Shape {

    @Override
    public void draw() {
        log.info("draw{}", "长方形");
    }
}
