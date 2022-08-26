package com.demo.design.lFlyWeight.flyWeightFactory;

import com.demo.design.lFlyWeight.concreteFlyWeight.BlackPieces;
import com.demo.design.lFlyWeight.concreteFlyWeight.WhitePieces;
import com.demo.design.lFlyWeight.flyWeight.ChessPieces;
import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;

/**
 * 零件厂
 *
 * @author shenghua.song
 * @date 2022/08/26
 */
@Slf4j
public class PiecesFactory {

    /**
     * 存储已创建的棋子   享元模式的精华
     */
    HashMap<String, ChessPieces> pieces = new HashMap<>();
    private final String WRITE = "Write";
    private final String BLACK = "Black";

    /**
     * 创建一个静态方法 获取棋子对象
     *
     * @param color 颜色
     * @return {@link ChessPieces}
     */
    public ChessPieces getPieceInstance(String color) {
        if (pieces.get(color) == null) {
            if (color.equals(WRITE)) {
                WhitePieces whitePieces = new WhitePieces();
                pieces.put(color, whitePieces);
            } else if (color.equals(BLACK)) {
                BlackPieces blackPieces = new BlackPieces();
                pieces.put(color, blackPieces);
            } else {
                log.info("不存在的颜色");
                return null;
            }
        }
        return pieces.get(color);
    }

    /**
     * 查看 hashmap 中总计的实例数量
     *
     * @return int
     */
    public int getInstallCount() {
        return pieces.size();
    }
}
