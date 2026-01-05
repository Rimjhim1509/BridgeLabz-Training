package com.encapsulation.hospitalpatientmanagement;

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;

    InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    @Override
    double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        setMedicalData("Admitted", record);
    }

    @Override
    public void viewRecords() {
        viewMedicalData();
    }
}
