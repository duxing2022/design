package com.demo.design.hFilter.subject;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 垃圾
 *
 * @author shenghua.song
 * @date 2022/08/22
 */

@Data
@AllArgsConstructor
public class Rubbish {

    /**
     * 垃圾名称
     */
    private String name;

    /**
     * 是否有害垃圾
     */
    private boolean isHarm;

    /**
     * 是否可回收
     */
    private boolean isRecycled;

    /**
     * 是否干垃圾
     */
    private boolean isDry;

    /**
     * 是否湿垃圾
     */
    private boolean isWet;

}
