package com.demo.design.bAbstractFactory.factory;


import com.demo.design.bAbstractFactory.Color;
import com.demo.design.bAbstractFactory.Shape;
import com.demo.design.bAbstractFactory.impl.Blue;
import com.demo.design.bAbstractFactory.impl.Green;
import com.demo.design.bAbstractFactory.impl.Red;

/**
 * 颜色工厂
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
