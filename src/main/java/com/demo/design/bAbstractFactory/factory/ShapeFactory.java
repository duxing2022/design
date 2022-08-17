package com.demo.design.bAbstractFactory.factory;


import com.demo.design.bAbstractFactory.product.Color;
import com.demo.design.bAbstractFactory.product.Shape;
import com.demo.design.bAbstractFactory.factory.impl.AbstractFactory;
import com.demo.design.bAbstractFactory.product.impl.Circle;
import com.demo.design.bAbstractFactory.product.impl.Rectangle;
import com.demo.design.bAbstractFactory.product.impl.Square;

/**
 * 形状工厂
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
