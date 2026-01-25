package com.resumescreeningsystem;

class ResumeGenerator {

    public static <T extends JobRole> Resume<T> generateResume(T role) {
        System.out.println("AI validating resume...");
        return new Resume<>(role);
    }
}
