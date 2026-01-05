package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    PaidOnlineCourse(String name, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}
