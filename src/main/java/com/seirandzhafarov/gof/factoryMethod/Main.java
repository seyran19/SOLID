package com.seirandzhafarov.gof.factoryMethod;

import com.seirandzhafarov.gof.factoryMethod.DeveloperFactory.DeveloperFactory;
import com.seirandzhafarov.gof.factoryMethod.DeveloperFactory.JavaDeveloperFactory;
import com.seirandzhafarov.gof.factoryMethod.DeveloperFactory.PythonDeveloperFactory;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("Python");


        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperFactory(String speciality) {
        return switch (speciality) {
            case "Java" -> new JavaDeveloperFactory();
            case "Python" -> new PythonDeveloperFactory();
            default -> throw new  RuntimeException("Invalid special type");
        };
    }
}
