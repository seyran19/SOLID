package com.seirandzhafarov.gof.adapter;

public class Main {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(10);
        RoundObject roundObject1 = new RoundObject(11);
        RoundObject roundObject2 = new RoundObject(10);
        AdapterForSquareObject adapter1 = new AdapterForSquareObject(11);
        AdapterForSquareObject adapter2 = new AdapterForSquareObject(5);

        System.out.println(roundHole.insert(adapter1));
        System.out.println(roundHole.insert(adapter2));

        System.out.println(roundHole.insert(roundObject1));
        System.out.println(roundHole.insert(roundObject2));
    }
}
