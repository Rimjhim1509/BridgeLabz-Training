package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
