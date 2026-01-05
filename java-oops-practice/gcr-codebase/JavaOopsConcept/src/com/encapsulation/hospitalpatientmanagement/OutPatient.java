package com.encapsulation.hospitalpatientmanagement;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        setMedicalData("OPD Visit", record);
    }

    @Override
    public void viewRecords() {
        viewMedicalData();
    }
}
