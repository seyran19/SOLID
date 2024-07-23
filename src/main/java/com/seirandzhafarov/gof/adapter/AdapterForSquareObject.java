package com.seirandzhafarov.gof.adapter;

public class AdapterForSquareObject extends SquareObject implements Roundable{

    public AdapterForSquareObject(double side) {
        super(side);
    }


    @Override
    public double getRadius() {
        return getSide() + Math.sqrt(2) / 2;
    }
}
