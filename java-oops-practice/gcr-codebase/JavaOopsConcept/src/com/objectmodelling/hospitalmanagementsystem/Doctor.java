package com.objectmodelling.hospitalmanagementsystem;

import java.util.*;

class Doctor {
    private String name;
    private List<Patient> patients;   // association

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // consultation method (communication)
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }

        System.out.println("Doctor " + name +
                           " is consulting patient " +
                           patient.getName());
    }
}
