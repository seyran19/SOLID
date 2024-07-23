package com.seirandzhafarov.gof.abstractFactory.website;

import com.seirandzhafarov.gof.abstractFactory.Developer;

public class PHPDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
