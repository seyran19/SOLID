package com.seirandzhafarov.gof.adapter;

public class RoundHole implements Roundable{

    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public boolean insert(Roundable roundable){
        return roundable.getRadius() <= this.radius;
    }
}
