package com.example.design.decorator;
/**
 *  @ClassName ShapeDecorator.java
 *  @author: 陈希
 *  @Date: 2020/11/19 11:39
 *  @Description: 抽象的装饰器
 *  @Version 1.0
 */
public abstract class ShapeDecorator  implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
