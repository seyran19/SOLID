package com.seirandzhafarov.gof.abstractFactory.website;

import com.seirandzhafarov.gof.abstractFactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void test() {
        System.out.println("Manual tester tests website...");
    }
}
