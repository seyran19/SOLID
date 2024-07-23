package com.seirandzhafarov.gof.abstractFactory;

import com.seirandzhafarov.gof.abstractFactory.booking.BookingTeamFactory;
import com.seirandzhafarov.gof.abstractFactory.booking.QATester;
import com.seirandzhafarov.gof.abstractFactory.website.WebsiteTeamFactory;

public class AuctionWebsite {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating website...");
        developer.writeCode();
        tester.test();
        projectManager.manageProject();
    }
}
