package com.seirandzhafarov.gof.abstractFactory;

import com.seirandzhafarov.gof.abstractFactory.booking.BookingTeamFactory;

public class SuperBookingSystem {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BookingTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating booking system...");
        developer.writeCode();
        tester.test();
        projectManager.manageProject();
    }
}

