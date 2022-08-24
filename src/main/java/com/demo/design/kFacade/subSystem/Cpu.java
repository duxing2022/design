package com.demo.design.kFacade.subSystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 中央处理器
 *
 * @author shenghua.song
 * @date 2022/08/24
 */

@Slf4j
public class Cpu {

    public void freeze() {
        log.info("CPU执行freeze操作");
    }
    public void jump() {
        log.info("CPU执行jump操作");
    }
    public void execute() {
        log.info("CPU正常运行");
    }
}
