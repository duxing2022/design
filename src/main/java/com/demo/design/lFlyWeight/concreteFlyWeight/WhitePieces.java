package com.demo.design.lFlyWeight.concreteFlyWeight;

import com.demo.design.lFlyWeight.unSharedConcreteFlyWeight.Point;
import com.demo.design.lFlyWeight.flyWeight.ChessPieces;
import lombok.extern.slf4j.Slf4j;

/**
 * 黑色碎片
 *
 * @author shenghua.song
 * @date 2022/08/26
 */

@Slf4j
public class WhitePieces implements ChessPieces {

    @Override
    public void downPieces(Point pt) {
        log.info("当前获取到的为===白===颜色的棋子");
        log.info("坐标X={};Y={}", pt.getX(), pt.getY());
    }
}
