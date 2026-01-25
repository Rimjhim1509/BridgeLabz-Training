package com.resumescreeningsystem;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResume =
            ResumeGenerator.generateResume(new SoftwareEngineer());
        seResume.processResume();


        List<SoftwareEngineer> seList =
            List.of(new SoftwareEngineer(), new SoftwareEngineer());

        ScreeningPieline.screenResumes(seList);
    }
}
