package com.seirandzhafarov.gof.abstractFactory;


public interface ProjectTeamFactory {

    Developer getDeveloper();

    ProjectManager getProjectManager();

    Tester getTester();
}
