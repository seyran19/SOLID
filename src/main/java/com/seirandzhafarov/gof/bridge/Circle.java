package com.seirandzhafarov.gof.bridge;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        color.fillColor();
    }
}
