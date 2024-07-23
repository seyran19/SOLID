package com.seirandzhafarov.gof.abstractFactory.website;

import com.seirandzhafarov.gof.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Project management manages website...");
    }
}
