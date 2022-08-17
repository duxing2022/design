package com.demo.design.bAbstractFactory.impl;

import com.demo.design.bAbstractFactory.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * 正方形
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
@Slf4j
public class Square implements Shape {

    @Override
    public void draw() {
        log.info("draw{}", "正方形");
    }
}
