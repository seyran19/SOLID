package com.seirandzhafarov.gof.factoryMethod.DeveloperFactory;

import com.seirandzhafarov.gof.factoryMethod.Developer;
import com.seirandzhafarov.gof.factoryMethod.PythonDeveloper;

public class PythonDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
