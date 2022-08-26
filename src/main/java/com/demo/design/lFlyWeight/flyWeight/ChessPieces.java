package com.demo.design.lFlyWeight.flyWeight;

import com.demo.design.lFlyWeight.unSharedConcreteFlyWeight.Point;

/**
 * 棋子
 *
 * @author shenghua.song
 * @date 2022/08/26
 */
public interface ChessPieces {

    /**
     * 落子方法 color:内部状态  pt：外部状态
     *
     * @param pt pt
     */
    void downPieces(Point pt);
}
