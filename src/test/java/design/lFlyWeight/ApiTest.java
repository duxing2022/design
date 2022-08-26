package design.lFlyWeight;

import com.demo.design.lFlyWeight.unSharedConcreteFlyWeight.Point;
import com.demo.design.lFlyWeight.flyWeight.ChessPieces;
import com.demo.design.lFlyWeight.flyWeightFactory.PiecesFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    private final static String WRITE = "Write";
    private final static String BLACK = "Black";

    @Test
    public void test_lFlyWeight() {

        //创建工程
        PiecesFactory factory = new PiecesFactory();
        //获取白色棋子
        //下琪1 = 白
        ChessPieces piece1 = factory.getPieceInstance(WRITE);
        piece1.downPieces(new Point(1, 2));
        //下琪1 = 黑
        ChessPieces pieceB1 = factory.getPieceInstance(BLACK);
        pieceB1.downPieces(new Point(2, 2));
        //下琪2 = 白
        ChessPieces piece2 = factory.getPieceInstance(WRITE);
        piece2.downPieces(new Point(2, 3));
        //下琪2 = 黑
        ChessPieces pieceB2 = factory.getPieceInstance(BLACK);
        pieceB2.downPieces(new Point(3, 2));
        //下琪3 = 白
        ChessPieces piece3 = factory.getPieceInstance(WRITE);
        piece3.downPieces(new Point(5, 7));
        //下琪3 = 黑
        ChessPieces pieceB3 = factory.getPieceInstance(BLACK);
        pieceB3.downPieces(new Point(6, 6));

        log.info(String.valueOf(factory.getInstallCount()));

    }
}

