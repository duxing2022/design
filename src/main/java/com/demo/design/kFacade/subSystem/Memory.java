package com.demo.design.kFacade.subSystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 内存
 *
 * @author shenghua.song
 * @date 2022/08/24
 */

@Slf4j
public class Memory {
    public void load() {
        log.info("将硬盘中读取到信息加载到运行内存");
    }
}
