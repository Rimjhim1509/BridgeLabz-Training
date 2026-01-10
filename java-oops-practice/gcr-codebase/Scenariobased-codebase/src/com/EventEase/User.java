package com.EventEase;

public class User {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    // sensitive data protected
    public String getMaskedEmail() {
        return email.replaceAll(".(?=.*@)", "*");
    }
}
