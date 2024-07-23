package com.seirandzhafarov.gof.abstractFactory.booking;

import com.seirandzhafarov.gof.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
