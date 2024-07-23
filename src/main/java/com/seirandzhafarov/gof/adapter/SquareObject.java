package com.seirandzhafarov.gof.adapter;

// Данный класс не совместим с классом RoundHole
// Для того чтобы поместить квадратны объект в круглое отверстие потребуется адаптер
public class SquareObject {

    private final double side;

    public SquareObject(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
