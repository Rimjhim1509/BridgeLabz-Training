package com.resumescreeningsystem;
import java.util.*;
class ScreeningPieline {

    public static void screenResumes(
            List<? extends JobRole> roles) {

        for (JobRole role : roles) {
            System.out.println(
                "Screening role: " + role.getRoleName()
            );
        }
    }
}
