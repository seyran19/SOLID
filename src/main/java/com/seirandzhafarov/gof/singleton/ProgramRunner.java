package com.seirandzhafarov.gof.singleton;

public class ProgramRunner {

    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("firstLog");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
