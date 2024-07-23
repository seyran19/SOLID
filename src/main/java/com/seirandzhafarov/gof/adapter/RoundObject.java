package com.seirandzhafarov.gof.adapter;

public class RoundObject implements Roundable{

    private final double radius;

    public RoundObject(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
