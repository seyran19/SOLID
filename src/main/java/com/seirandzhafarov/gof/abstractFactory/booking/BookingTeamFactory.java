package com.seirandzhafarov.gof.abstractFactory.booking;

import com.seirandzhafarov.gof.abstractFactory.Developer;
import com.seirandzhafarov.gof.abstractFactory.ProjectManager;
import com.seirandzhafarov.gof.abstractFactory.ProjectTeamFactory;
import com.seirandzhafarov.gof.abstractFactory.Tester;

public class BookingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BookingPM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
