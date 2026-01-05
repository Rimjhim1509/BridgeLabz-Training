package com.encapsulation.hospitalpatientmanagement;

abstract class Patient {

    protected int patientId;
    protected String name;
    protected int age;

    // Encapsulation (sensitive data)
    private String diagnosis;
    private String medicalHistory;

    Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("ID: " + patientId + 
                           ", Name: " + name + 
                           ", Age: " + age);
    }

    // Encapsulation
    protected void setMedicalData(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.medicalHistory = history;
    }

    protected void viewMedicalData() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("History: " + medicalHistory);
    }
}
