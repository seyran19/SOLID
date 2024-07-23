package com.seirandzhafarov.gof.abstractFactory.website;

import com.seirandzhafarov.gof.abstractFactory.Developer;
import com.seirandzhafarov.gof.abstractFactory.ProjectManager;
import com.seirandzhafarov.gof.abstractFactory.ProjectTeamFactory;
import com.seirandzhafarov.gof.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
