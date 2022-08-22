package com.demo.design.iCombination.leaf;

import com.demo.design.iCombination.component.Articles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 商品
 *
 * @author shenghua.song
 * @date 2022/08/22
 */

@Slf4j
@Data
@AllArgsConstructor
public class Goods implements Articles {

    /**
     * 名称
     */
    private String name;

    /**
     * 数量
     */
    private int quantity;

    /**
     * 单价
     */
    private float unitPrice;

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public void show() {
        log.info("商品名称:{}(数量:{},单价:{}元)", name, quantity, unitPrice);
    }
}
