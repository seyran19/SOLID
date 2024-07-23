package com.seirandzhafarov.gof.factoryMethod.DeveloperFactory;

import com.seirandzhafarov.gof.factoryMethod.Developer;
import com.seirandzhafarov.gof.factoryMethod.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
