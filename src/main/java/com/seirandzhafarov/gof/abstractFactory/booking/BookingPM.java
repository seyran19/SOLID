package com.seirandzhafarov.gof.abstractFactory.booking;

import com.seirandzhafarov.gof.abstractFactory.ProjectManager;

public class BookingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Booking PM manages booking project");
    }
}
